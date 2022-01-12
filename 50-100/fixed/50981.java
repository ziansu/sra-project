@java.lang.Override
public float getExpectedRestCost(final org.anddev.andengine.util.path.ITiledMap<T> pTiledMap, final T pEntity, final int pTileFromX, final int pTileFromY, final int pTileToX, final int pTileToY) {
    return (java.lang.Math.abs((pTileFromX - pTileToX))) + (java.lang.Math.abs((pTileFromY - pTileToY)));
}