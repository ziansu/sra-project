@java.lang.Override
public java.util.List<com.google.gwt.editor.client.EditorError> validate(com.google.gwt.editor.client.Editor<java.lang.String> editor, java.lang.String value) {
    java.util.List<com.google.gwt.editor.client.EditorError> result = new java.util.LinkedList<com.google.gwt.editor.client.EditorError>();
    edu.arizona.biosemantics.matrixreview.client.common.SetValueValidator.ValidationResult validationResult = validator.validate(value);
    if (!(validationResult.isValid())) {
        result.add(new com.sencha.gxt.widget.core.client.form.error.DefaultEditorError(editor, validationResult.getReason(), value));
    }
    return result;
}