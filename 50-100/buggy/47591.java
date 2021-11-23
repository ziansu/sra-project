public boolean new_item(char[] cBarcode, java.lang.String sName, double dPrice, int iAmount, boolean bisFood) {
    cashRegisterSystem.cashRegisterSystem.inventoryArticle newArticle = null;
    newArticle.setBarcode(cBarcode);
    newArticle.setPrice(iAmount);
    newArticle.setName(sName);
    newArticle.setFood(bisFood);
    inventory.add(newArticle);
    write_inventory();
    return false;
}