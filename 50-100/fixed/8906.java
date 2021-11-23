public java.util.Map<java.lang.Integer, int[]> getListOfCoordinates() {
    java.util.Map<java.lang.Integer, int[]> listOfCoordinates = new java.util.HashMap<>();
    int key = 0;
    for (int x = 0; x < (Game.Controllers.BoardController.BOARDSIZE); x++) {
        for (int y = 0; y < (Game.Controllers.BoardController.BOARDSIZE); y++) {
            listOfCoordinates.put(key, new int[]{ x , y });
            key++;
        }
    }
    return listOfCoordinates;
}