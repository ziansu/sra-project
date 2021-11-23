public void multiply(com.romraider.maps.Table currentTable) {
    try {
        currentTable.multiply(com.romraider.util.NumberUtil.doubleValue(setValueText.getText()));
    } catch (java.text.ParseException nex) {
        com.romraider.swing.TableToolBar.LOGGER.error((((((this.getClass().getName()) + ".multiply(") + currentTable) + ") ") + nex));
    }
}