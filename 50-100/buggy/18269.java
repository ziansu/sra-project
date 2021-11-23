public void actionPerformed(java.awt.event.ActionEvent e) {
    userDimensions.clear();
    for (int i = 0; i < (possibleDimensions.size()); i++) {
        if (checkboxes[i].isSelected()) {
            userDimensions.add(possibleDimensions.get(i));
        }
    }
    dimensions.setVisible(false);
    initializeMeasures(integerColumns);
}