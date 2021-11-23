public void move(Direction d) {
    if ((position) != null) {
        Cell target = position.getNeighbor(d);
        if (target != null)
            target.action(this, position);
        
    }
}