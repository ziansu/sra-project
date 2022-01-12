public hex.Hex RandomHexReconZone() {
    int x = bbms.GlobalFuncs.randRange(((friendlyZone) + 1), ((enemyZone) - 1));
    int y = bbms.GlobalFuncs.randRange(0, ((yDim) - 1));
    hex.Hex finger = getHex(x, y);
    if (!(inReconZone(finger))) {
        gui.GUI_NB.GCO((((("ERROR!  Hex " + x) + ", ") + y) + " is not in the recon zone!"));
    }
    return finger;
}