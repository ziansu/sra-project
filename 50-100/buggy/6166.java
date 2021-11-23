public boolean showDialog() {
    ij.gui.GenericDialog gd = new ij.gui.GenericDialog("De-Interleaver");
    gd.addNumericField("How many channels?", nChannels, 0);
    gd.addCheckbox("Keep source stack", keep);
    gd.showDialog();
    if (gd.wasCanceled())
        return false;
    
    nChannels = ((int) (gd.getNextNumber()));
    keep = gd.getNextBoolean();
    ij.Prefs.set("Deint_ch.int", nChannels);
    ij.Prefs.set("Deint_keep.boolean", keep);
    return true;
}