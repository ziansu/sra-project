private static java.util.Map<java.lang.String, java.lang.String> getNativeEnvironmentCasePreserved() {
    synchronized(org.eclipse.tcf.te.runtime.utils.Env.ENV_GET_MONITOR) {
        if ((org.eclipse.tcf.te.runtime.utils.Env.nativeEnvironmentCasePreserved) == null) {
            org.eclipse.tcf.te.runtime.utils.Env.nativeEnvironmentCasePreserved = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
            org.eclipse.tcf.te.runtime.utils.Env.cacheNativeEnvironment(org.eclipse.tcf.te.runtime.utils.Env.nativeEnvironmentCasePreserved);
        }
        return new java.util.LinkedHashMap<java.lang.String, java.lang.String>(org.eclipse.tcf.te.runtime.utils.Env.nativeEnvironmentCasePreserved);
    }
}