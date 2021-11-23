public java.lang.String lookupValue(java.lang.String name) {
    name = org.zoxweb.shared.util.SharedStringUtil.toLowerCase(name);
    if (!(org.zoxweb.shared.util.SharedStringUtil.isEmpty(name)))
        return properties.get(name);
    
    return null;
}