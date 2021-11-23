public void placeStartLake(hf.game.items.LakeTile lake) {
    java.lang.System.out.println("place start lake.");
    lake.flipFaceUp();
    entities.get(lake.getIndex()).setLake(lake);
    giveLanternCard();
}