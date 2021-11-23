public java.lang.String getErrorMessage(java.lang.String constraintName) {
    java.lang.String errorMessage = ((org.modeldriven.alf.syntax.common.ConstraintViolation.errorMessages) == null) ? null : org.modeldriven.alf.syntax.common.ConstraintViolation.errorMessages.get(constraintName);
    return errorMessage == null ? constraintName : ((errorMessage + " (") + constraintName) + ")";
}