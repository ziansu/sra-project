void changeInvenQuantity() {
    long sku = java.lang.Long.parseLong(skuInvenText.getText());
    int quant = java.lang.Integer.parseInt(quantityInvenText.getText());
    threadcount.ThreadGUI.c.changeItemQuantity(sku, quant);
    inventoryLog.setText("quantity changed");
}