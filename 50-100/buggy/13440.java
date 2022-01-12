public void equalPasswords(final java.lang.String password, final java.lang.String passwordVerification, final java.util.Map<java.lang.String, java.lang.String> errors, final java.lang.String key, final java.lang.String field) {
    if (!(errors.containsKey(key))) {
        if (password != passwordVerification) {
            errors.put(key, field);
        }
    }
}