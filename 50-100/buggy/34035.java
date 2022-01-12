public boolean isApproveDisabled() {
    if (((authService.getGroupMembershipHeader()) != null) && (authService.getGroupMembershipHeader().contains(AuthenticationService.REQUESTER_GROUP)))
        return true;
    
    if ((((selectedData) != null) && ((selectedData.getCmqStatus()) != null)) && (CmqBase190.CMQ_STATE_VALUE_REVIEWED.equalsIgnoreCase(selectedData.getCmqState())))
        return false;
    
    return true;
}