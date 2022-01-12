private void emptyGridLabels(int elevatorNum) {
    for (int i = 0; i < (view.getFloorsNumber()); i++) {
        javax.swing.JLabel tempLabel = ((javax.swing.JLabel) (view.getGridPanels()[i][elevatorNum].getComponent(0)));
        tempLabel.setText("");
    }
}