private astar.Path FinalPath() {
    map.Tile aux = dest;
    astar.Path path = new astar.Path();
    while (aux != (origin)) {
        path.add(aux);
        aux = cameFrom[aux.getPosX()][aux.getPosY()];
    } 
    return path;
}