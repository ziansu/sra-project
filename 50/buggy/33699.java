public void updateSpawns() {
    for (int i = 0; i < (toSpawn.size()); i++)
        addGameObject(toSpawn.remove(i));
    
}