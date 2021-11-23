@java.lang.Override
public com.tech.configurations.tools.Pair<java.lang.Boolean, org.springframework.http.ResponseEntity> validate(java.lang.String str) {
    if ((str == null) || (str.isEmpty())) {
        return com.tech.configurations.tools.Pair.of(java.lang.Boolean.FALSE, getErrorResponse());
    }
    if ((next) != null) {
        return next.validate(str);
    }else {
        return com.tech.configurations.tools.Pair.of(java.lang.Boolean.TRUE, getSuccessResponse());
    }
}