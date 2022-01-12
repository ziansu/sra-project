@java.lang.Override
protected boolean validate() {
    if (create) {
        return (ecfSchemaForm.validate()) && (!(ecfSchemaForm.isEmpty()));
    }else {
        return true;
    }
}