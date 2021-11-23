public org.nutz.mvc.config.AtMap add(java.lang.String key, java.lang.String actionPath) {
    if (actionPath.endsWith("/*"))
        actionPath = actionPath.substring(0, ((actionPath.length()) - 2));
    
    ats.put(org.nutz.lang.Strings.trim(key), org.nutz.lang.Strings.trim(actionPath));
    return this;
}