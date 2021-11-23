public static void addRule(com.springboot.model.Policy policy) {
    java.util.List<com.springboot.model.Policy> policyList = null;
    try {
        policyList = com.springboot.util.JsonUtils.deserialize();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    if (policyList == null)
        return ;
    
    if (policyList.contains(policy))
        return ;
    
    policyList.add(policy);
    try {
        com.springboot.util.JsonUtils.serialize(policyList);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}