public boolean RadioCheck() {
    for (int i = 0; i < (rB.size()); i++) {
        if (rB.get(i).isCorrect()) {
            return rB.get(i).getRadioButton().isSelected();
        }
    }
    return false;
}