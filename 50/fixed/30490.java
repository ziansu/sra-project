public static java.lang.String javaVersion(final java.lang.String def) {
    final java.lang.String javaVersionProperty = org.jruby.util.SafePropertyAccessor.getProperty("java.version", def);
    if ("0".equals(javaVersionProperty))
        return "1.7.0";
    
    return javaVersionProperty;
}