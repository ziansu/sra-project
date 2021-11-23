public eu.europa.ec.fisheries.uvms.rules.service.business.fact.CodeType mapToCodeType(eu.europa.ec.fisheries.uvms.rules.service.mapper.fact.CodeType codeType) {
    if (codeType == null) {
        return null;
    }
    eu.europa.ec.fisheries.uvms.rules.service.mapper.fact.CodeType codeType1 = new eu.europa.ec.fisheries.uvms.rules.service.mapper.fact.CodeType();
    codeType1.setListId(codeType.getListID());
    codeType1.setValue(codeType.getValue());
    return codeType1;
}