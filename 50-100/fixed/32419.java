private static void manageEditArgument(java.lang.String[] args) {
    if ((args.length) > 1) {
        com.doos.webloc_opener.core.Main.runEditDialog(args[1]);
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, ("Argument '-edit' should have " + "location path parameter."), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}