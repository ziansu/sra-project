@java.lang.Override
public boolean isHyperlinkPoint(javax.swing.text.Document doc, int offset) {
    org.openide.filesystems.FileObject fo = org.jetbrains.kotlin.utils.ProjectUtils.getFileObjectForDocument(doc);
    if ((org.jetbrains.kotlin.utils.ProjectUtils.getKotlinProjectForFileObject(fo)) == null) {
        return false;
    }
    try {
        referenceExpression = org.jetbrains.kotlin.navigation.NavigationUtil.getReferenceExpression(doc, offset);
        return (referenceExpression) != null;
    } catch (javax.swing.text.BadLocationException ex) {
        org.openide.util.Exceptions.printStackTrace(ex);
        return false;
    }
}