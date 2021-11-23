public de.ingrid.mdek.beans.address.MdekAddressBean createNewAddress(java.lang.String parentUuid) {
    de.ingrid.mdek.dwr.services.AddressServiceImpl.log.debug(("creating new address with parent id = " + parentUuid));
    de.ingrid.mdek.beans.address.MdekAddressBean data = null;
    try {
        data = addressRequestHandler.getInitialAddress(parentUuid);
    } catch (java.lang.Exception e) {
        de.ingrid.mdek.dwr.services.AddressServiceImpl.log.error("Error while getting address data.", e);
    }
    if (data != null) {
        de.ingrid.mdek.util.MdekAddressUtils.setInitialValues(data);
        data.setNodeAppType(de.ingrid.mdek.dwr.services.AddressServiceImpl.ADDRESS_APPTYPE);
        data.setUuid("newNode");
    }
    return data;
}