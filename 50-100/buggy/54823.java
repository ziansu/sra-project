public static de.btu.openinfra.backend.db.pojos.AttributeValueValuePojo mapToPojoStatically(java.util.Locale locale, de.btu.openinfra.backend.db.jpa.model.AttributeValueValue avv) {
    de.btu.openinfra.backend.db.pojos.AttributeValueValuePojo avvPojo = new de.btu.openinfra.backend.db.pojos.AttributeValueValuePojo();
    avvPojo.setTopicInstanceId(avv.getTopicInstance().getId());
    avvPojo.setValue(de.btu.openinfra.backend.db.daos.ValueDao.mapToPojoStatically(avv.getPtFreeText()));
    avvPojo.setAttributeTypeToAttributeTypeGroupId(avv.getAttributeTypeToAttributeTypeGroup().getId());
    avvPojo.setUuid(avv.getId());
    return avvPojo;
}