@java.lang.Override
public java.io.File showOpenFileChooser(java.awt.Component parent, java.lang.String title, java.lang.String fileExtension, java.lang.String fileDescription) {
    java.util.Set<java.lang.String> extensions = new java.util.HashSet<>();
    for (java.lang.String ext : fileExtension.split(",")) {
        extensions.add(ext.trim());
    }
    return org.protege.editor.core.ui.util.UIUtil.openFile(new javax.swing.JDialog(), title, fileDescription, extensions);
}