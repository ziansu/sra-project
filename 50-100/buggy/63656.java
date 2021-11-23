@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    boolean shortRangeSelected = infoPanel.getShortRangeButton();
    boolean medRangeSelected = infoPanel.getMedRangeButton();
    boolean longRangeSelected = infoPanel.getLongRangeButton();
    if (shortRangeSelected) {
        medRangeSelected = false;
        longRangeSelected = false;
    }
    if (medRangeSelected) {
        shortRangeSelected = false;
        longRangeSelected = false;
    }
    if (longRangeSelected) {
        shortRangeSelected = false;
        medRangeSelected = false;
    }
}