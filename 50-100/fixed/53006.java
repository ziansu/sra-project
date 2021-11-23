private static java.lang.String populate(java.util.Map<java.lang.String, java.lang.Object> props, java.lang.String key, java.lang.String cur) {
    java.lang.String str = props.get(key).toString();
    if (!(org.apache.commons.lang.StringUtils.isEmpty(str))) {
        cur = str;
    }
    return cur;
}