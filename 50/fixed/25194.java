@java.lang.Override
public bomberman.gameplay.GameMap clone() {
    return new bomberman.gameplay.GameMap(this.name, this.thumbnailKey, this.tiles.clone(), new java.util.ArrayList(this.startPositions));
}