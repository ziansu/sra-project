public void showRenameMessage(java.lang.String toBeRenamed) {
    java.lang.Object[] options = new java.lang.Object[]{ "    Yes    " , "    No    " };
    int choice = javax.swing.JOptionPane.showOptionDialog(null, (((GraphicalInterfaceConstants.PARTICIPATING_METAB_RENAME_MESSAGE_PREFIX) + toBeRenamed) + (GraphicalInterfaceConstants.PARTICIPATING_METAB_RENAME_MESSAGE_SUFFIX)), GraphicalInterfaceConstants.PARTICIPATING_METAB_RENAME_TITLE, javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    if (choice == (javax.swing.JOptionPane.YES_OPTION)) {
        edu.rutgers.MOST.presentation.GraphicalInterface.renameMetabolite = true;
    }
    if (choice == (javax.swing.JOptionPane.NO_OPTION)) {
    }
}