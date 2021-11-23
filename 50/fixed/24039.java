private void addTile(com.simulus.view.Tile t) {
    synchronized(this) {
        if (!(occupiedTiles.contains(t)))
            occupiedTiles.add(t);
        
    }
}