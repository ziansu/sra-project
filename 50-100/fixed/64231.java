protected void search() {
    java.util.Iterator<com.redmart.skiinginsingapore.MainActivity.Coords> i_coords = sortedCoords.iterator();
    while (i_coords.hasNext()) {
        com.redmart.skiinginsingapore.MainActivity.Coords coords = i_coords.next();
        com.redmart.skiinginsingapore.MainActivity.Result r = findLongestPath(coords.x, coords.y, allMap[coords.x][coords.y], new java.util.LinkedList<java.lang.Integer>());
        if (((r.length) >= (r.droppingFrom)) || ((maxResult.length) >= (r.droppingFrom)))
            break;
        
    } 
}