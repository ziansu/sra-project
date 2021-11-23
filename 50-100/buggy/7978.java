@java.lang.Override
public void addSettingsStateListener(@org.jetbrains.annotations.NotNull
com.intellij.platform.WebProjectGenerator.SettingsStateListener stateListener) {
    final javax.swing.text.JTextComponent editorComponent = ((javax.swing.text.JTextComponent) (sdkPathComboWithBrowse.getComboBox().getEditor().getEditorComponent()));
    editorComponent.getDocument().addDocumentListener(new com.intellij.ui.DocumentAdapter() {
        protected void textChanged(javax.swing.event.DocumentEvent e) {
            stateListener.stateChanged(((validate()) == null));
        }
    });
}