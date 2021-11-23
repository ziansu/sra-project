public int getLength() {
    int length = 0;
    for (MapObjects.DynamicMapObjects.SnakeCell cell : this) {
        if (cell.getIsDestructed())
            break;
        
        ++length;
    }
    return length;
}