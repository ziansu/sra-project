public java.util.Hashtable<java.lang.String, java.lang.String> extractHashtableEnv() {
    java.util.Hashtable<java.lang.String, java.lang.String> env = new java.util.Hashtable<>();
    if ((this.getEnvironment()) != null) {
        for (org.wso2.carbon.datasource.core.beans.JNDIConfig.EnvEntry entry : this.getEnvironment()) {
            env.put(entry.getName(), entry.getValue());
        }
    }
    return env;
}