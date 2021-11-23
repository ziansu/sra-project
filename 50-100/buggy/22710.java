public boolean validateSponsor(org.kuali.kra.bo.Sponsor sponsor) {
    boolean valid = true;
    if ((!(sponsor.isActive())) && (!(org.kuali.rice.kns.util.KNSGlobalVariables.getMessageList().contains(new org.kuali.rice.krad.util.ErrorMessage(org.kuali.kra.infrastructure.KeyConstants.ERROR_INACTIVE_SPONSOR_CODE))))) {
        org.kuali.rice.kns.util.KNSGlobalVariables.getMessageList().add(KeyConstants.ERROR_INACTIVE_SPONSOR_CODE);
    }
    if (sponsor == null) {
        valid = false;
    }
    return valid;
}