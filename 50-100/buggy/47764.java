public int[] setStartPoint() {
    int startX = (random.nextInt(((MainClass.mazeSizeWidth) - 2))) + 1;
    int startY = (random.nextInt(((MainClass.mazeSizeHeight) - 2))) + 1;
    MainClass.tilesArray[startX][startY].setState("start");
    int[] returnList = new int[]{ startX , startY };
    return returnList;
}