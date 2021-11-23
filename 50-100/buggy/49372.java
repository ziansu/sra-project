private void validateField(julianfalcionelli.magicform.base.FormField formField) {
    java.util.List<julianfalcionelli.magicform.base.FormError> errors = new java.util.ArrayList<>();
    errors.addAll(checkField(formField));
    if (errors.isEmpty()) {
        addValidField(formField);
    }else {
        mErrors.addAll(errors);
        removeValidField(formField);
    }
}