private java.lang.String getMuleHomeEnvVarOrSystemProperty() {
    java.lang.String muleHome = java.lang.System.getProperty("mule.home");
    if (muleHome == null) {
        muleHome = java.lang.System.getenv("MULE_HOME");
    }
    return muleHome;
}