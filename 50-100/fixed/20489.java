public static void registerValidatorTypeFailure(java.lang.Class<?> keyType, java.lang.Object failureBean) {
    java.util.Map<java.lang.Class<?>, java.lang.Object> failureMap = org.lastaflute.core.magic.ThreadCacheContext.getObject(org.lastaflute.core.magic.ThreadCacheContext.FW_VALIDATOR_TYPE_FAILURE);
    if (failureMap == null) {
        failureMap = new java.util.HashMap<java.lang.Class<?>, java.lang.Object>();
        org.lastaflute.core.magic.ThreadCacheContext.setObject(org.lastaflute.core.magic.ThreadCacheContext.FW_VALIDATOR_TYPE_FAILURE, failureMap);
    }
    failureMap.put(keyType, failureBean);
}