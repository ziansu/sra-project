public boolean die(Client src, Player newPosition) {
    assert (maze) != null;
    if (maze.clientDie(this, src, newPosition)) {
        notifyDie();
        return true;
    }else {
        return false;
    }
}