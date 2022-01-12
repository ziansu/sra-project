private refactored.Item chooseItem(refactored.Auction chosenAuc) {
    refactored.Item chosenItem = null;
    for (int i = 0; i < (chosenAuc.getAllItems().size()); i++) {
        if (i == ((pickItem) - 1)) {
            chosenItem = chosenAuc.getAllItems().get(i);
            java.lang.System.out.println(chosenAuc.getAllItems().get(i).getTitle());
        }
    }
    return chosenItem;
}