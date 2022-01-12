private static fr.cls.atoll.motu.web.dal.tds.ncss.model.Property initProperty(fr.cls.atoll.motu.web.dal.tds.ncss.model.Property tdsProperty) throws fr.cls.atoll.motu.web.bll.exception.MotuException {
    fr.cls.atoll.motu.web.dal.tds.ncss.model.Property property = fr.cls.atoll.motu.web.usl.response.xml.converter.ProductMetadataInfoConverter.createProperty();
    if (tdsProperty == null) {
        return property;
    }
    property.setName(tdsProperty.getName());
    property.setValue(tdsProperty.getValue());
    property.setCode(java.lang.String.valueOf(ErrorType.OK));
    property.setMsg(ErrorType.OK.toString());
    return property;
}