private java.lang.String getFieldName() {
    final java.util.Optional<org.drools.workbench.services.verifier.api.client.index.Field> field = getField();
    if (field.isPresent()) {
        return field.get().getFactType();
    }else {
        return "";
    }
}