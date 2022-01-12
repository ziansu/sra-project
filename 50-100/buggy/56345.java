private boolean checkDuplicate(final java.util.List<org.atmosphere.cpr.AtmosphereInterceptor> interceptorList, java.lang.Class<? extends org.atmosphere.cpr.AtmosphereInterceptor> c) {
    for (final org.atmosphere.cpr.AtmosphereInterceptor i : interceptorList) {
        if (i.getClass().equals(c)) {
            return false;
        }
    }
    return true;
}