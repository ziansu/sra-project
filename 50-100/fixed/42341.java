public static org.keycloak.models.ModelException convert(java.lang.Throwable t) {
    if (((t.getCause()) != null) && ((t.getCause()) instanceof org.hibernate.exception.ConstraintViolationException)) {
        throw new org.keycloak.models.ModelDuplicateException(t);
    }
    if ((t instanceof javax.persistence.EntityExistsException) || (t instanceof org.hibernate.exception.ConstraintViolationException)) {
        throw new org.keycloak.models.ModelDuplicateException(t);
    }else {
        throw new org.keycloak.models.ModelException(t);
    }
}