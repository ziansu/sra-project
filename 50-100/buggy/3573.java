private void createUnitBoard() {
    unitBoard.setLayout(new java.awt.GridLayout(4, 1));
    unitType = new javax.swing.JLabel("Unit ID : ");
    veteran = new javax.swing.JLabel("Experience:");
    unitBoard.add(unitType);
    unitBoard.add(veteran);
    nextUnit = new javax.swing.JButton("Next Unit");
    nextUnit.setFocusPainted(false);
    civ.gui.UnitSwitchListener unitSwitchListener = new civ.gui.UnitSwitchListener(this);
    nextUnit.addActionListener(unitSwitchListener);
    unitBoard.add(nextUnit);
}