@java.lang.Override
public void delete(java.lang.String id) throws org.opentdc.service.exception.NotFoundException {
    org.opentdc.addressbooks.file.ABaddressbook _adb = readAddressbook(id);
    for (org.opentdc.addressbooks.file.ABcontact _contact : _adb.getContacts()) {
        removeContactFromIndex(_contact);
    }
    if ((org.opentdc.addressbooks.file.FileServiceProvider.abookIndex.remove(id)) == null) {
        throw new org.opentdc.service.exception.InternalServerErrorException((("addressbook <" + id) + "> can not be removed, because it does not exist in the index"));
    }
    exportJson(org.opentdc.addressbooks.file.FileServiceProvider.abookIndex.values());
    org.opentdc.addressbooks.file.FileServiceProvider.logger.info((("delete(" + id) + ")"));
}