public static java.util.Set<java.lang.String> getKeyTemplates() {
    if ((org.wso2.carbon.throttle.service.impl.BlockConditionDBUtil.keyTemplates) == null) {
        org.wso2.carbon.throttle.service.impl.BlockConditionDBUtil.getGlobalPolicyKeyTemplates();
    }
    return org.wso2.carbon.throttle.service.impl.BlockConditionDBUtil.keyTemplates;
}