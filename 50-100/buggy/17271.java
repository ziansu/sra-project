private void setUpEnvironment() {
    setCarbonHome();
    java.util.Map<java.lang.String, java.lang.String> envVarMap = new java.util.HashMap<>();
    envVarMap.put("pqr.http.port", "8501");
    envVarMap.put("sample.abc.port", "8081");
    org.wso2.carbon.config.configuration.utils.EnvironmentUtils.setEnv(envVarMap);
    java.lang.System.setProperty("abc.http.port", "8001");
    java.lang.System.setProperty("sample.xyz.port", "9091");
    java.lang.System.setProperty("pqr.secure", "true");
}