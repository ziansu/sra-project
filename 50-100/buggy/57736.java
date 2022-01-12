private int matchingSector(int sector) {
    int mirroringSector = 0;
    int[] mirroredSectors = new int[]{ 3 , 2 , 1 , 8 , 7 , 6 , 5 , 4 };
    mirroringSector = mirroredSectors[(sector - 1)];
    return mirroringSector;
}