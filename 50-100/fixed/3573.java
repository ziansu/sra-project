private void createUnitBoard() {
    unitBoard.setLayout(new java.awt.GridLayout(4, 1));
    unitType = new javax.swing.JLabel("Unit ID : ");
    veteran = new javax.swing.JLabel("Experience:");
    nextUnit = new javax.swing.JButton("Next Unit");
    nextUnit.setFocusPainted(false);
    unitBoard.add(nextUnit);
    unitBoard.add(unitType);
    unitBoard.add(veteran);
    civ.gui.UnitSwitchListener unitSwitchListener = new civ.gui.UnitSwitchListener(this);
    nextUnit.addActionListener(unitSwitchListener);
}