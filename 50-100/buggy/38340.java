public long getRemainingTime() {
    if (!(action.getParameters().containsKey(org.md2k.study.model_view.privacy_control.PrivacyControlManager.MAX_TIME)))
        return java.lang.Integer.MAX_VALUE;
    
    long maxTime = java.lang.Long.parseLong(action.getParameters().get(org.md2k.study.model_view.privacy_control.PrivacyControlManager.MAX_TIME));
    return maxTime - (getRunningTime());
}