private org.mifosplatform.portfolio.creditcheck.domain.CreditCheck getCreditCheckFromList(final java.util.Collection<org.mifosplatform.portfolio.creditcheck.domain.CreditCheck> creditChecks, final java.lang.Long creditCheckId) {
    org.mifosplatform.portfolio.creditcheck.domain.CreditCheck creditCheckFound = null;
    if ((creditChecks != null) && (!(creditChecks.isEmpty()))) {
        for (org.mifosplatform.portfolio.creditcheck.domain.CreditCheck creditCheck : creditChecks) {
            if (creditCheck.getId().equals(creditCheckId)) {
                creditCheckFound = creditCheck;
                break;
            }
        }
    }
    return creditCheckFound;
}