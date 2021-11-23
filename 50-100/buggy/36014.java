protected java.lang.String getPortViaActuator(javax.management.MBeanServerConnection connection) throws java.lang.Exception {
    java.lang.String environment = getEnvironment();
    if (environment != null) {
        org.json.JSONObject env = new org.json.JSONObject(environment);
        if (env != null) {
            org.json.JSONObject portsObject = env.getJSONObject("server.ports");
            if (portsObject != null) {
                java.lang.String portValue = portsObject.getString("local.server.port");
                return portValue;
            }
        }
    }
    return null;
}