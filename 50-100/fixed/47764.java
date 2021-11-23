public int[] setStartPoint() {
    int startY = (random.nextInt(((MainClass.mazeSizeHeight) - 2))) + 1;
    int startX = (random.nextInt(((MainClass.mazeSizeWidth) - 2))) + 1;
    MainClass.tilesArray[startY][startX].setState("start");
    int[] returnList = new int[]{ startY , startX };
    return returnList;
}