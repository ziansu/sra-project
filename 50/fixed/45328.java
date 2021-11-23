public javax.swing.JPanel createCostView() {
    javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridBagLayout());
    costLabel.setText(java.lang.String.format("Cost: %.2f", selectedRoom.getCost()));
    panel.add(costLabel);
    return panel;
}