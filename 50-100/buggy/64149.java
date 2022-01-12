public void add(com.ca.om.client.base.jsobj.JsAddress addr) {
    com.ca.om.client.base.ui.AddressGrid.Cell cell = new com.ca.om.client.base.ui.AddressGrid.Cell();
    cell.val(addr);
    int wc = this.cellPanel.getWidgetCount();
    cell.getElement().getStyle().setFloat(Style.Float.LEFT);
    this.cellPanel.insert(cell, (wc - 1));
}