private void emptyGridLabels(int elevatorNum) {
    for (int i = 1; i < ((view.getFloorsNumber()) + 1); i++) {
        javax.swing.JLabel tempLabel = ((javax.swing.JLabel) (view.getGridPanels()[i][elevatorNum].getComponent(0)));
        tempLabel.setText("");
    }
}