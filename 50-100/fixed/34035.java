public boolean isApproveDisabled() {
    if ((((selectedData) != null) && ((selectedData.getCmqStatus()) != null)) && (CmqBase190.CMQ_STATE_VALUE_REVIEWED.equalsIgnoreCase(selectedData.getCmqState()))) {
        if (((authService.getGroupMembershipHeader()) != null) && (authService.getGroupMembershipHeader().contains(AuthenticationService.REQUESTER_GROUP)))
            return true;
        
        return false;
    }
    return true;
}