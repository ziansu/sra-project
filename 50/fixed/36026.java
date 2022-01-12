@java.lang.Override
public java.lang.String parseHost(java.lang.String app) {
    return prop.getProperty((("app." + app) + ".host"));
}