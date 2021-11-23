@java.lang.Override
protected java.util.List<net.osmand.map.TileSourceManager.TileSourceTemplate> doInBackground(java.lang.Void... params) {
    java.io.File tPath = app.getAppPath(IndexConstants.TILES_INDEX_DIR);
    java.util.List<net.osmand.map.TileSourceManager.TileSourceTemplate> availableSourceTemplates = net.osmand.map.TileSourceManager.getLocalTileSourceTemplates(tPath);
    if (availableSourceTemplates != null) {
        availableSourceTemplates.addAll(net.osmand.map.TileSourceManager.downloadTileSourceTemplates(net.osmand.plus.Version.getVersionAsURLParam(app)));
        return availableSourceTemplates;
    }else {
        return net.osmand.map.TileSourceManager.downloadTileSourceTemplates(net.osmand.plus.Version.getVersionAsURLParam(app));
    }
}