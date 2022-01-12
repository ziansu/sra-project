public void queueItem(de.voodoosoft.gameroots.frontend.gdx.view.render.batch.BatchRenderItem item) {
    int layer = item.getLayer();
    de.voodoosoft.gameroots.frontend.gdx.view.render.batch.BatchRenderItem[] items = itemLayers.get(layer);
    if ((itemCount[layer]) == (items.length)) {
        items = java.util.Arrays.copyOf(items, ((items.length) * 2));
    }
    int i = (itemCount[layer])++;
    items[i] = item;
}