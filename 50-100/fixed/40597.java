public void ResetearDungeonCamino() {
    for (int i = 0; i < (this.dungeon.length); i++) {
        for (int j = 0; j < (this.dungeon[i].length); j++) {
            this.dungeon[i][j].inicio = false;
            this.dungeon[i][j].camino = false;
            this.dungeon[i][j].destino = false;
        }
    }
}