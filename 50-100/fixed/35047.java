@java.lang.Override
public com.kepler.protocol.Request valid(com.kepler.protocol.Request request) throws com.kepler.KeplerValidateException {
    for (java.lang.Object arg : request.args()) {
        if (arg != null) {
            for (javax.validation.ConstraintViolation<java.lang.Object> valid : com.kepler.protocol.validation.Jsr303Validation.VALIDATOR.validate(arg)) {
                throw new com.kepler.KeplerLocalException(valid.getMessage());
            }
        }
    }
    return request;
}