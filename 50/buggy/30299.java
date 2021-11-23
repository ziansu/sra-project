@java.lang.Override
protected boolean validate() {
    if (create) {
        return (ecfSchemaForm.validate()) && (isEmpty(ecfSchemaForm));
    }else {
        return true;
    }
}