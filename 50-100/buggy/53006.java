private static java.lang.String populate(java.util.Map<java.lang.String, java.lang.Object> props, java.lang.String key, java.lang.String cur) {
    java.lang.String str = ((java.lang.String) (props.get(key)));
    if (!(org.apache.commons.lang.StringUtils.isEmpty(str))) {
        cur = str;
    }
    return cur;
}