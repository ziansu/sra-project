private java.lang.Long updateContact(com.itechart.scrapper.model.smg.SmgProfile profile) {
    java.lang.Long contactId = null;
    if (!(org.springframework.util.StringUtils.isEmpty(profile.getEmail()))) {
        com.itechart.scrapper.model.crm.contact.ContactDto contact = profile.convertToContact();
        com.itechart.scrapper.model.crm.contact.ContactDto originalContact = getContactFromCrm(profile.getEmail());
        originalContact.addFields(contact);
        updateContactInCrm(originalContact);
        contactId = originalContact.getId();
    }else {
        com.itechart.scrapper.utils.CrmEditor.log.info("profile {} has no email, not updating", profile.getDomenName());
    }
    return contactId;
}