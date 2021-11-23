public void run() {
    if (((currentSortThread) != null) && (!(sortingstarted))) {
        sortingstarted = true;
        sort();
        sortingstarted = false;
    }else {
        currentdialog = new javax.swing.JFrame();
        currentdialog.setLocationRelativeTo(this);
        option = javax.swing.JOptionPane.showConfirmDialog(currentdialog, "The Output Dir is empty. Should I sort the Dicoms to the Input folder?\nChoosing yes, setting the Image Digits to 0.\n(After 10 Seconds yes is picked automatically.)", "The Outputdir is empty", javax.swing.JOptionPane.YES_NO_OPTION);
    }
}