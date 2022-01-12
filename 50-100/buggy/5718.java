public void processQueue() {
    for (java.util.Iterator<fi.riissanen.gwent.engine.assets.AssetLoader> it = queue.keySet().iterator(); it.hasNext();) {
        fi.riissanen.gwent.engine.assets.AssetLoader loader = it.next();
        fi.riissanen.gwent.engine.assets.AssetParams params = queue.get(loader);
        fi.riissanen.gwent.engine.assets.Asset asset = loader.load(params);
        if (asset != null) {
            assets.put(params.getFilename(), asset);
        }
        it.remove();
    }
}