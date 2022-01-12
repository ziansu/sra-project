@java.lang.Override
public boolean dialogItemChanged(ij.gui.GenericDialog sfgd, java.awt.AWTEvent e) {
    marginLeft = sfgd.getNextNumber();
    marginRight = sfgd.getNextNumber();
    marginTop = sfgd.getNextNumber();
    marginBottom = sfgd.getNextNumber();
    prohibitedLineColor = sfgd.getNextChoice();
    acceptanceLineColor = sfgd.getNextChoice();
    acceptanceLineType = sfgd.getNextChoice();
    err = "";
    drawSamplingFrame(true);
    return true;
}