public java.util.Set<com.ctrip.framework.apollo.core.enums.Env> emailSupportedEnvs() {
    java.lang.String[] configurations = getArrayProperty("email.supported.envs", null);
    java.util.Set<com.ctrip.framework.apollo.core.enums.Env> result = com.google.common.collect.Sets.newHashSet();
    if ((configurations == null) || ((configurations.length) == 0)) {
        return result;
    }
    for (java.lang.String env : configurations) {
        result.add(com.ctrip.framework.apollo.core.enums.Env.fromString(env));
    }
    return result;
}