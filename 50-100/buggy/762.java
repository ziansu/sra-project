private java.lang.String getClassCanonicalName(javax.swing.JTextField textField) {
    java.lang.String canonicalName = textField.getText().replaceAll(" ", "").replaceAll(".java$", "");
    if ((org.apache.http.util.TextUtils.isEmpty(canonicalName)) || (canonicalName.endsWith("."))) {
        com.intellij.openapi.ui.Messages.showMessageDialog(mMapperRuntimeParams.getProject(), "error", "the class name is not allowed", com.intellij.openapi.ui.Messages.getErrorIcon());
        return null;
    }
    return canonicalName;
}