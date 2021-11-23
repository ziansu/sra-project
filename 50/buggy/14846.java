public java.lang.String lookupValue(java.lang.String name) {
    name = org.zoxweb.shared.util.SharedStringUtil.toLowerCase(name);
    if (name != null) {
        return properties.get(name);
    }
    return null;
}