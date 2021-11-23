private boolean compareValues(java.lang.Object fieldValue, com.atlassian.crowd.embedded.api.User user, boolean allowUserInField) {
    boolean result = !allowUserInField;
    if (fieldValue instanceof java.lang.String) {
        if (fieldValue.equals(user.getName())) {
            result = allowUserInField;
        }
    }else {
        if (fieldValue.equals(user)) {
            result = allowUserInField;
        }
    }
    return result;
}