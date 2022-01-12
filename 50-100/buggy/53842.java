public boolean canImport(javax.swing.JComponent comp, java.awt.datatransfer.DataFlavor[] transferFlavors) {
    java.lang.System.out.println("Something Happened 1");
    if (comp instanceof com.zerulus.hub.MyTree) {
        for (int i = 0; i < (transferFlavors.length); i++) {
            if (!(transferFlavors[i].equals(java.awt.datatransfer.DataFlavor.javaFileListFlavor))) {
                return false;
            }
        }
        return true;
    }
    return false;
}