public static java.lang.String getStringProperty(java.util.Map<java.lang.String, ?> props, java.lang.String name, java.lang.String defaultValue) {
    java.lang.Object value = (org.apache.sshd.common.util.GenericUtils.isEmpty(props)) ? null : props.get(name);
    java.lang.String s = java.util.Objects.toString(value, null);
    if (org.apache.sshd.common.util.GenericUtils.isEmpty(s)) {
        return defaultValue;
    }else {
        return s;
    }
}