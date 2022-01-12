@java.lang.Override
protected void endOfData() {
    super.endOfData();
    if (doPlots) {
        java.io.File outputFile2 = new java.io.File("mergingPlots.aida");
        outputFile2.getParentFile().mkdirs();
        try {
            aida2.saveAs(outputFile2);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(org.hps.recon.tracking.MergeTrackCollections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}