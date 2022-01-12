@java.lang.Override
public com.groupc.game.GameScreen getNext() {
    if ((next) == 1) {
        return new com.groupc.game1.World(assets);
    }
    if ((next) == 2) {
        return new com.groupc.game1.Options(assets, this.cam);
    }
    if ((next) == 3) {
        return new com.groupc.game1.UpgradeScreen(assets);
    }
    if ((next) == 4) {
        return new com.groupc.game1.Instructions(assets);
    }
    return null;
}