@java.lang.Override
public java.lang.String generateLegalCaseNumber() {
    final java.lang.String sequenceName = org.egov.lcms.autonumber.impl.LegalCaseNumberGeneratorImpl.LEGALCASE_NUMBER_SEQ_PREFIX;
    final org.egov.commons.CFinancialYear finYear = financialYearDAO.getFinancialYearByDate(new java.util.Date());
    final java.io.Serializable nextSequence = applicationSequenceNumberGenerator.getNextSequence(sequenceName);
    return java.lang.String.format("%s%s%s%06d", "LC/", ((legalCaseUtil.getCityCode()) + "/"), (finYear != null ? finYear.getFinYearRange().split("-")[0] : ""), ("/" + nextSequence));
}