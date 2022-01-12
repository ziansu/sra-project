public void fillList(java.util.List<se.chalmers.ait.dat215.project.ShoppingItem> list) {
    gridPane.getChildren().clear();
    theItemList = list;
    setHeight(((list.size()) * 140));
    int i = 0;
    for (se.chalmers.ait.dat215.project.ShoppingItem si : theItemList) {
        itp = new application.ItemInList(si);
        add(itp, i);
        i++;
    }
    java.lang.System.out.println("Finish loop");
}