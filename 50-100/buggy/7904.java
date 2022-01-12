public void removeIfDeadStone(goGame.Index i) {
    java.util.Set<goGame.Index> checkedStones = new java.util.HashSet<>();
    if (isDead(i, checkedStones)) {
        checkedStones.add(i);
        if (!(checkedStones.isEmpty())) {
            deadStone = true;
        }
        for (goGame.Index deadStones : checkedStones) {
            stones.put(deadStones, goGame.Board.Status.NONE);
            GUI.removeStone(i.getX(), i.getY());
        }
    }
}