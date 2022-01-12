@java.lang.Override
protected boolean isItemHoldable(org.vufind.ItemInfo itemInfo, org.vufind.Scope curScope) {
    java.util.ArrayList<org.vufind.LoanRule> relevantLoanRules = getRelevantLoanRules(itemInfo.getITypeCode(), itemInfo.getLocationCode(), curScope.getRelatedNumericPTypes());
    for (org.vufind.LoanRule loanRule : relevantLoanRules) {
        if (loanRule.getHoldable()) {
            return true;
        }
    }
    return false;
}