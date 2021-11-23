public void addTiles(int fromX, int fromY, int width, int height, int hCount, int vCount) {
    for (int y = 0; y < vCount; y++)
        for (int x = 0; x < hCount; x++)
            addTile(((y * hCount) + x), (fromX + (x * width)), (fromY + (y * height)), width, height, false, false, false);
        
    
}