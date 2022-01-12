@java.lang.Override
public boolean dialogItemChanged(ij.gui.GenericDialog sfgd, java.awt.AWTEvent e) {
    marginTop = sfgd.getNextNumber();
    marginBottom = sfgd.getNextNumber();
    marginLeft = sfgd.getNextNumber();
    marginRight = sfgd.getNextNumber();
    prohibitedLineColor = sfgd.getNextChoice();
    acceptanceLineColor = sfgd.getNextChoice();
    acceptanceLineType = sfgd.getNextChoice();
    err = "";
    drawSamplingFrame(true);
    return true;
}