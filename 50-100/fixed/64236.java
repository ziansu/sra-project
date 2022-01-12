private void onTextFilterKeyTyped() {
    final java.lang.String text = filterText.getText();
    if (text.equals("")) {
        restoreFilterTextHint();
    }else {
        filterText.setForeground(java.awt.Color.BLACK);
    }
    if ((transfersFilterModeListener) != null) {
        transfersFilterModeListener.onFilterUpdate(text);
    }
}