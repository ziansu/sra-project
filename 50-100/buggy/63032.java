@java.lang.Override
public void startFetchForTile(com.mousebird.maply.QuadImageTileLayerInterface quadImageTileLayerInterface, com.mousebird.maply.MaplyTileID maplyTileID, int frame) {
    android.util.Log.i(com.mousebirdconsulting.maplyandroidtester.LocalAssetsTileProvider.TAG, "Will fire tech...");
    com.mousebirdconsulting.maplyandroidtester.LocalAssetsTileProvider.TileLoaderTask task = new com.mousebirdconsulting.maplyandroidtester.LocalAssetsTileProvider.TileLoaderTask(quadImageTileLayerInterface, maplyTileID, frame);
    com.mousebirdconsulting.maplyandroidtester.LocalAssetsTileProvider.AsyncTileLoader tileLoader = new com.mousebirdconsulting.maplyandroidtester.LocalAssetsTileProvider.AsyncTileLoader();
    tileLoader.execute(task);
    android.util.Log.v(com.mousebirdconsulting.maplyandroidtester.LocalAssetsTileProvider.TAG, "  -> Fired!");
}