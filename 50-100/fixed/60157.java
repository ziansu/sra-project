@java.lang.Override
protected java.lang.String getResourceName(java.lang.Class<?> clazz) {
    org.springframework.web.bind.annotation.RequestMapping mapping = getAnnotation(clazz, org.springframework.web.bind.annotation.RequestMapping.class, true);
    java.lang.String outMapping = "";
    if ((mapping != null) && (org.springframework.util.StringUtils.hasText(mapping.name()))) {
        outMapping = mapping.name();
    }
    return com.phoenixnap.oss.ramlapisync.naming.NamingHelper.resolveProperties(outMapping);
}