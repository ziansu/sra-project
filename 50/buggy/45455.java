@java.lang.Override
public com.google.common.base.Optional<java.lang.Long> getLong(java.lang.String name) {
    java.lang.String value = getParameter(name);
    if (value == null) {
        return com.google.common.base.Optional.absent();
    }
    return org.retrostore.util.NumUtil.parseLong(name);
}