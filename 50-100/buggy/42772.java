@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    boolean change = (((strategy) != (tmpStrategy)) || ((nbClass) != (tmpNbClassVal))) || ((nbAttVal) != (tmpNbAttVal));
    strategy = tmpStrategy;
    nbClass = tmpNbClassVal;
    nbAttVal = tmpNbAttVal;
    if (change) {
        count2D = createCount2D();
        java.lang.System.out.println(("count2D reset:" + (count2D)));
    }
    calcul = false;
    optionFrame.setVisible(false);
    optionFrame.dispose();
}