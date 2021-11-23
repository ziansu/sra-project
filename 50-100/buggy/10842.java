public java.util.HashSet<Tile> getKnownBombs() {
    java.util.HashSet<Tile> s = new java.util.HashSet<Tile>();
    if ((config_list.size()) == 0)
        return s;
    else {
        s = config_list.get(0);
        for (java.util.HashSet<Tile> h : config_list) {
            s.retainAll(h);
        }
    }
    return s;
}