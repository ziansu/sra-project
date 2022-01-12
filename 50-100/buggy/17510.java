@java.lang.Override
public void run() {
    java.io.File output = chooseFile(javax.swing.JFileChooser.SAVE_DIALOG, javax.swing.JFileChooser.FILES_ONLY);
    if (output == null) {
        java.lang.System.out.println("No output file was selected...");
    }else {
        java.lang.System.out.println(("saving to " + (output.getAbsolutePath())));
        save(output);
        java.lang.System.out.println("saved");
        this.requestFocusInWindow();
        this.requestFocus();
        if (net.clonecomputers.lab.starburst.VersionDependentMethodUtilities.appleEawtAvailable()) {
            net.clonecomputers.lab.starburst.VersionDependentMethodUtilities.appleForeground();
        }
    }
}