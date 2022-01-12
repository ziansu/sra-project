@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    boolean shortRangeSelected = false;
    boolean medRangeSelected = false;
    boolean longRangeSelected = false;
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