public void printEntityNames() {
    for (maelstrom.entity.GameEntity entity : entities) {
        java.lang.System.out.println(("There is a " + (entity.getName())));
    }
}