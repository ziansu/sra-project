public void convertGridToStringCoords() {
    int idx = 0;
    int[] numCoords = new int[2];
    for (idx = 0; idx < 3; idx++) {
        java.lang.String tempCoord = null;
        numCoords = locGridCoords.get(idx);
        tempCoord = ("" + ((char) ((numCoords[0]) + 65))) + (numCoords[1]);
        java.lang.System.out.println(tempCoord);
        locGridArray.add(tempCoord);
    }
}