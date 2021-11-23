public java.lang.String getSequence(com.axelor.apps.base.db.Company company) throws com.axelor.exception.AxelorException {
    java.lang.String seq = sequenceService.getSequenceNumber(IAdministration.SALES_ORDER, company);
    if (seq == null) {
        throw new com.axelor.exception.AxelorException(java.lang.String.format(com.axelor.i18n.I18n.get(IExceptionMessage.SALES_ORDER_1), company.getName()), com.axelor.exception.db.IException.CONFIGURATION_ERROR);
    }
    return seq;
}