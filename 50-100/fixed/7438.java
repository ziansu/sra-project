private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String name = jTextField1.getText();
    java.lang.System.out.println(name);
    Zipper.Zip a = new Zipper.Zip();
    a.modpack = name;
    a.archiveDir(null);
    Modpacktxt.name = name;
    try {
        Zipper.Modpacktxt.main(null);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(Zipper.frage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    this.dispose();
}