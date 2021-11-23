public void profileTotal() {
    getTicketDtl().setpTotal(java.math.BigDecimal.ZERO);
    for (bean.profileData pData : getNonCashProfileDtlData().getSelectedProfileDataList()) {
        if ((pData.getAmount()) == null) {
            pData.setAmount(java.math.BigDecimal.ZERO);
        }
        getTicketDtl().setpTotal(getTicketDtl().getpTotal().add(pData.getAmount()));
    }
}