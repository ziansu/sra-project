public com.ci.group20.util.Coordinate size() {
    if ((cells.length) == 0)
        return com.ci.group20.util.Coordinate.get(0, 0);
    
    return com.ci.group20.util.Coordinate.get(cells.length, cells[0].length);
}