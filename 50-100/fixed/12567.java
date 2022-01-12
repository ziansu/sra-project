public void tick() {
    for (int i = 0; i < (enemies.size()); i++) {
        enemies.get(i).tick();
        if ((enemies.get(i).getHealth()) <= 0)
            enemies.remove(i);
        
    }
}