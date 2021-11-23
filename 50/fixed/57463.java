public void resolveTileSpecs() throws java.lang.IllegalStateException {
    for (org.janelia.alignment.spec.TileSpec tileSpec : tileIdToSpecMap.values()) {
        resolveTileSpec(tileSpec);
    }
}