private void spawnEnemies() {
    for (int i = 0; i < 1; i++) {
        enemies.add(new edu.chl.blastinthepast.model.Enemy(player));
    }
    for (edu.chl.blastinthepast.model.Enemy e : enemies) {
        java.util.Random r = new java.util.Random();
        e.getPosition().setX(((r.nextFloat()) * 800));
        e.getPosition().setY(((r.nextFloat()) * 480));
        e.addObserver(this);
    }
}