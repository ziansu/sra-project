private java.lang.String getOwner(com.xpn.xwiki.doc.XWikiDocument patientDoc) {
    java.lang.String owner = getPropertyValue(patientDoc, Owner.CLASS_REFERENCE, Owner.PROPERTY_NAME, "");
    if (org.apache.commons.lang3.StringUtils.isNotBlank(owner)) {
        return owner;
    }
    if ((patientDoc.getCreatorReference()) != null) {
        return this.serializer.serialize(patientDoc.getCreatorReference());
    }
    return owner;
}