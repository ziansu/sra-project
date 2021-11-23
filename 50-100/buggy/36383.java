public static void main(java.lang.String[] args) {
    CMB.OS = CMB.getOsName();
    java.lang.System.out.println(("Central Movie Database - " + (CMB.dateActuelle())));
    if (!(CMB.createFichier())) {
        java.lang.System.err.println("Error when creating the file");
        java.lang.System.exit(1);
    }
    javax.swing.SwingUtilities.invokeLater(CMB_gui::new);
}