public org.openstreetmap.josm.data.validation.TestError.Builder highlightNodePairs(java.util.Collection<java.util.List<org.openstreetmap.josm.data.osm.Node>> highlighted) {
    org.openstreetmap.josm.tools.CheckParameterUtil.ensureThat(((this.highlighted) == null), "highlighted already set");
    this.highlighted = highlighted;
    return this;
}