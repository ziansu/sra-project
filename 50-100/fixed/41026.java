private void setOtherPlayerSelection(int index) {
    textButton[index].setText(otherPlayerName);
    textButton[index].setChecked(true);
    textButton[index].setDisabled(true);
    if (((otherPlayerSel) != (-1)) && ((otherPlayerSel) != index)) {
        textButton[otherPlayerSel].setText("");
        textButton[otherPlayerSel].setChecked(false);
        textButton[otherPlayerSel].setDisabled(false);
    }
    otherPlayerSel = index;
}