@java.lang.Override
public java.io.File showSaveFileChooser(java.awt.Component parent, java.lang.String title, java.lang.String fileExtension, java.lang.String fileDescription, boolean overwrite) {
    java.util.Set<java.lang.String> extensions = new java.util.HashSet<>();
    extensions.add(fileExtension);
    return org.protege.editor.core.ui.util.UIUtil.saveFile(new javax.swing.JDialog(), title, fileDescription, extensions, null);
}