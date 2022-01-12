private void addMiscPenalty(java.util.List<org.mifos.dto.domain.ApplicableCharge> applicableChargeList) {
    org.mifos.dto.domain.ApplicableCharge applicableCharge = new org.mifos.dto.domain.ApplicableCharge();
    applicableCharge.setFeeId(AccountConstants.MISC_PENALTY);
    applicableCharge.setFeeName("Misc Penalty");
    applicableCharge.setIsRateType(false);
    applicableCharge.setIsPenaltyType(false);
    applicableChargeList.add(applicableCharge);
}