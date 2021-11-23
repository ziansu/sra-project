public static void removeRule(com.springboot.model.Policy policy) throws java.io.IOException {
    java.util.List<com.springboot.model.Policy> policyList = null;
    policyList = com.springboot.util.JsonUtils.deserialize();
    if (policyList == null)
        return ;
    
    if (!(policyList.contains(policy))) {
        return ;
    }
    policyList.remove(policy);
    com.springboot.util.JsonUtils.serialize(policyList);
}