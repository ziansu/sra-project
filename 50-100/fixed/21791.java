public boolean basicValidation() {
    java.lang.String titulo = titleField.getText().toString();
    java.lang.String descripcion = bodyField.getText().toString();
    return (!(titulo.isEmpty())) || (!(descripcion.isEmpty()));
}