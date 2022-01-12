protected void nextBlock() {
    currentPos = currentPos.east();
    if ((currentPos.getX()) > (maxX)) {
        currentPos = currentPos.add((-(range)), 0, 1);
        if ((currentPos.getZ()) > (maxZ))
            currentPos = null;
        
    }
}