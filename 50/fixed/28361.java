@java.lang.Override
protected java.lang.String resolvePlaceholder(java.lang.String placeholder, java.util.Properties props) {
    return com.iquanwai.platon.biz.util.ConfigUtils.getValue(placeholder);
}