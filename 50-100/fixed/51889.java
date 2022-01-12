private static void maybeAdd(final java.util.Set<javax.validation.ConstraintViolation<?>> violations, final javax.validation.ConstraintViolation<?>... toAdd) {
    for (javax.validation.ConstraintViolation<?> violation : toAdd) {
        if (violation != null) {
            violations.add(violation);
        }
    }
}