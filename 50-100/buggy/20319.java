public static void removeValidatorTypeFailure(java.lang.Class<?> keyType) {
    if (org.lastaflute.core.magic.ThreadCacheContext.exists()) {
        java.util.Map<java.lang.Class<?>, java.lang.Object> failureMap = org.lastaflute.core.magic.ThreadCacheContext.getObject(org.lastaflute.core.magic.ThreadCacheContext.FW_VALIDATOR_TYPE_FAILURE);
        if ((failureMap != null) && ((failureMap.get(keyType)) != null)) {
            failureMap.remove(keyType);
        }
        if (failureMap.isEmpty()) {
            org.lastaflute.core.magic.ThreadCacheContext.removeObject(org.lastaflute.core.magic.ThreadCacheContext.FW_VALIDATOR_TYPE_FAILURE);
        }
    }
}