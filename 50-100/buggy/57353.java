public int getPosLayer(java.lang.String layerName) {
    int result = -1;
    for (int id = 0; id < (layers.size()); id++) {
        SourceryTextb1.Layer get = layers.get(id);
        if (get.nameMatches(layerName)) {
            result = id;
        }
    }
    return result;
}