public static int chooseLine(java.util.ArrayList<java.lang.String> possibleItems) {
    application.LogicController.printList(possibleItems);
    application.DataManager.getInstance().savePossibleItems(possibleItems);
    return -1;
}