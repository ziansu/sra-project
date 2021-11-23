protected boolean isProxime() {
    boolean result = false;
    try {
        result = this.sensorsUtility.isProxime();
    } catch (java.lang.InstantiationException e) {
        e.printStackTrace();
    }
    return result;
}