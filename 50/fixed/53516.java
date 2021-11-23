public int getLength() {
    int length = 0;
    for (MapObjects.DynamicMapObjects.SnakeCell cell : this)
        ++length;
    
    return length;
}