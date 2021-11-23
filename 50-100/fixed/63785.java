public void getItemList() {
    java.lang.System.out.println("Item Number \t Title");
    for (int i = 0; i < (NewItem.itemArray.length); i++) {
        if (!((NewItem.itemArray[i][3]) == null)) {
            java.lang.System.out.println((((NewItem.itemArray[i][3]) + "\t\t\t") + (NewItem.itemArray[i][1])));
        }
    }
}