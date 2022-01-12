public java.util.Map<java.lang.String, java.lang.String> getEnv() {
    java.util.Map<java.lang.String, java.lang.String> environment = new java.util.HashMap<>();
    for (java.lang.String envString : getDetailedInfo().config().env()) {
        environment.put(envString.split("=")[0], envString.split("=")[1]);
    }
    return environment;
}