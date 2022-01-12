private void validateField(julianfalcionelli.magicform.base.FormField formField) {
    java.util.List<julianfalcionelli.magicform.base.FormError> errors = checkField(formField);
    if (errors.isEmpty()) {
        addValidField(formField);
    }else {
        mErrors.addAll(errors);
        removeValidField(formField);
    }
}