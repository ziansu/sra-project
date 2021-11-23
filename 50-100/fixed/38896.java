int find(int pixelID) {
    int x = getXcoord(pixelID);
    int y = getYcoord(pixelID);
    while ((parentID[y][x]) >= 0) {
        pixelID = parentID[y][x];
        x = getXcoord(pixelID);
        y = getYcoord(pixelID);
    } 
    return pixelID;
}