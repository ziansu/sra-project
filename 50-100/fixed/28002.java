public static java.lang.String getCadena(java.lang.String clave) {
    java.lang.String ret = null;
    try {
        ret = com.kalos.recursos.Recursos.recursos.getString(clave);
    } catch (java.util.MissingResourceException e) {
    }
    if (ret == null)
        throw new java.util.MissingResourceException(("no se encontró cadena para la clave=" + clave), "java.lang.String", clave);
    else
        return ret;
    
}