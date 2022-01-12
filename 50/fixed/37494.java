private boolean containsWall(java.util.Stack<Cell> line) {
    for (Cell c : line)
        if (c.isWall())
            return true;
        
    
    return false;
}