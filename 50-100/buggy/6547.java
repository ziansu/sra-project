public java.lang.String getComputeResourceLoginUserName() {
    if ((isUseUserCRPref()) && (isValid(userComputeResourcePreference.getLoginUserName()))) {
        return userStoragePreference.getLoginUserName();
    }else
        if (isValid(processModel.getProcessResourceSchedule().getOverrideLoginUserName())) {
            return processModel.getProcessResourceSchedule().getOverrideLoginUserName();
        }else {
            return gatewayComputeResourcePreference.getLoginUserName();
        }
    
}