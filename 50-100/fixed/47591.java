public boolean new_item(char[] cBarcode, java.lang.String sName, double dPrice, int iAmount, boolean bisFood) {
    cashRegisterSystem.cashRegisterSystem.inventoryArticle newArticle = new cashRegisterSystem.cashRegisterSystem.inventoryArticle(cBarcode, sName, iAmount, dPrice);
    newArticle.setFood(bisFood);
    inventory.add(newArticle);
    write_inventory();
    return false;
}