public void getElementData() {
    if (!(textCtrl.isDisposed())) {
        textVal = textCtrl.getText();
        if ((comboCtrl) != null) {
            itemSelIndex = comboCtrl.getSelectionIndex();
        }
        if ((!(updateElemFlag)) && (!(tooltip.isDisposed()))) {
            tooltip.setVisible(false);
        }
    }
}