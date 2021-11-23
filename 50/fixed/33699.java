public void updateSpawns() {
    for (int i = (toSpawn.size()) - 1; i >= 0; i--)
        addGameObject(toSpawn.remove(i));
    
}