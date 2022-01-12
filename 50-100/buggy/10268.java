public websays.accounting.CommissionItem createCommissionItem(websays.accounting.BilledItem bi) {
    double fee = websays.core.utils.CurrencyUtils.toEuros(bi.getFee(), bi.getCurrency());
    int monthsFromStartOfContract = websays.core.utils.JodaUtils.monthsDifference(bi.period.contractStart, bi.period.periodEnd);
    fee = computeCommission(fee, monthsFromStartOfContract);
    return new websays.accounting.CommissionItem(commissionnee, fee, this, bi);
}