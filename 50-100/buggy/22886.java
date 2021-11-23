public static void handleDevError(java.lang.Throwable t) {
    if (org.nuxeo.runtime.api.Framework.isBooleanPropertyTrue(org.nuxeo.runtime.api.Framework.NUXEO_STRICT_RUNTIME_SYSTEM_PROP)) {
        java.lang.System.err.println(("Fatal error caught in strict " + "runtime mode => exiting."));
        t.printStackTrace();
        java.lang.System.exit(1);
    }else {
        org.nuxeo.runtime.api.Framework.log.error(t, t);
    }
}