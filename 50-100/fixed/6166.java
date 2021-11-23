public boolean showDialog() {
    ij.gui.GenericDialog gd = new ij.gui.GenericDialog("De-Interleaver");
    gd.addNumericField("How many channels?", nChannels, 0);
    gd.showDialog();
    if (gd.wasCanceled())
        return false;
    
    nChannels = ((int) (gd.getNextNumber()));
    keep = false;
    ij.Prefs.set("Deint_ch.int", nChannels);
    ij.Prefs.set("Deint_keep.boolean", keep);
    return true;
}