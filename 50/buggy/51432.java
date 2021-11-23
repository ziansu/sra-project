@java.lang.Override
public boolean isValid() {
    final java.lang.String value = getValue();
    return !((org.apache.commons.lang.StringUtils.isEmpty(value)) || (org.apache.commons.lang.StringUtils.isBlank(value)));
}