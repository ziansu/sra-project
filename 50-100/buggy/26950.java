public static boolean showDiagnostics(java.lang.String[] args) {
    if (null != (java.lang.System.getProperty(io.osv.util.ClassDiagnostics.JAVA_DIAGNOSTICS_PROPERTY_NAME))) {
        return true;
    }
    if (args == null) {
        return false;
    }
    final java.lang.String diagnosticsPropertyToCompare = ("-D" + (io.osv.util.ClassDiagnostics.JAVA_DIAGNOSTICS_PROPERTY_NAME)).toLowerCase();
    for (java.lang.String arg : args) {
        if (arg.toLowerCase().startsWith(diagnosticsPropertyToCompare)) {
            return true;
        }
    }
    return false;
}