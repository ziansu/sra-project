private refactored.Item chooseItem(int pickItem, refactored.Auction chosenAuc) {
    refactored.Item chosenItem = null;
    for (int i = 0; i < (chosenAuc.getAllItems().size()); i++) {
        if (i == pickItem) {
            chosenItem = chosenAuc.getAllItems().get((i - 1));
            java.lang.System.out.println(chosenAuc.getAllItems().get((i - 1)).getTitle());
        }
    }
    return chosenItem;
}