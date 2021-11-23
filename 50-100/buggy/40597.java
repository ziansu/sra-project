public void ResetearDungeonCamino() {
    for (int i = 0; i <= ((dungeon.length) - 1); i++) {
        for (int j = 0; j <= ((dungeon[i].length) - 1); j++) {
            dungeon[i][j].inicio = false;
            dungeon[i][j].camino = false;
            dungeon[i][j].destino = false;
        }
    }
}