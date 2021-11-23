protected void constructContents(int screenWidth, int screenHeight) {
    java.util.ArrayList<cg.group4.rewards.collectibles.Collectible> sortedList = cSorter.sortCollectibles(cCollection.getCollection());
    for (cg.group4.rewards.collectibles.Collectible c : sortedList) {
        cContentTable.row().height((screenHeight / (cItemsOnScreen))).width(screenWidth);
        cContentTable.add(cGameSkin.generateDefaultLabel(java.lang.Double.toString(c.getRarity())));
    }
}