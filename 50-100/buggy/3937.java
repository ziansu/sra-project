public java.util.Hashtable<java.lang.String, java.lang.String> extractHashtableEnv() {
    java.util.Hashtable<java.lang.String, java.lang.String> env = new java.util.Hashtable<>();
    for (org.wso2.carbon.datasource.core.beans.JNDIConfig.EnvEntry entry : this.getEnvironment()) {
        java.lang.String value = env.put(entry.getName(), entry.getValue());
    }
    return env;
}