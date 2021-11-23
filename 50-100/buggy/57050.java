public void captureProduct() {
    int product_ID = getSelectedRecord();
    if ((product_ID > 0) && (!(selectLock))) {
        java.lang.String productValue = org.compiere.util.DB.getSQLValueString(null, "SELECT Value FROM M_Product p WHERE M_Product_ID=?", product_ID);
        try {
            lookupProductInterface.findProduct(true);
        } catch (java.lang.Exception exception) {
            org.adempiere.webui.window.FDialog.error(0, exception.getLocalizedMessage());
        }
        this.setText(productValue);
    }
}