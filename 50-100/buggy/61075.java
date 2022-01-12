private boolean dirtyCurrentProjectHandled() {
    if (isCurrentProjectDirty()) {
        int choice = javax.swing.JOptionPane.showConfirmDialog(com.sandy.jnmaker.util.ObjectRepository.getMainFrame(), ("There are unsaved changes. Save before exit?\n" + "Yes to save, No to discard and Cancel to abort."));
        if (choice == (javax.swing.JOptionPane.CANCEL_OPTION)) {
            return false;
        }else
            if (choice == (javax.swing.JOptionPane.OK_OPTION)) {
                saveProject();
            }
        
    }
    return true;
}