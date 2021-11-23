public java.lang.String getObjectionNumber() {
    java.lang.String type = org.egov.ptis.constants.PropertyTaxConstants.OBJECTION_SEQ_STR;
    return (type + "/") + (org.apache.commons.lang.StringUtils.leftPad(sequenceNumberGenerator.getNextNumber(type, 1).getFormattedNumber(), 8, "0"));
}