public void add(game.roles.Replicator replicator, game.map.Cell cell) {
    if ((this.replicator) != null) {
        throw new java.lang.IllegalArgumentException("replicator already exist");
    }
    java.lang.System.out.println(("replicator created at " + (getCoordinate(cell))));
    this.replicator = replicator;
    replicator.setSelfControlled(randomReplicator);
    cell.addElement(replicator);
    cell.acceptMovable(replicator);
}