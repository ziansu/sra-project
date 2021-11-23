int find(int pixelID) {
    int x = getXcoord(pixelID);
    int y = getYcoord(pixelID);
    while ((parentID[x][y]) >= 0) {
        pixelID = parentID[x][y];
        x = getXcoord(pixelID);
        y = getYcoord(pixelID);
    } 
    return pixelID;
}