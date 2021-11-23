private javax.validation.ConstraintViolation<?>[] validateNotSamePort(final java.lang.String httpPortPath, final java.lang.Integer httpPort, final java.lang.String httpsPortPath, final java.lang.Integer httpsPort) {
    if ((httpPort != null) && (java.util.Objects.equals(httpPort, httpsPort))) {
        return new javax.validation.ConstraintViolation<?>[]{ constraintViolationFactory.createViolation(httpPortPath, "HTTP and HTTPs ports must be different") , constraintViolationFactory.createViolation(httpsPortPath, "HTTP and HTTPs ports must be different") };
    }
    return null;
}