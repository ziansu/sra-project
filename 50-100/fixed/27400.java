public boolean directoryFilter(final com.github.poeatlas.cli.ggpk.DirectoryNode node) {
    final java.lang.String nodePath = node.getPath().toLowerCase();
    return (((("/art/2dart/atlas".equals(nodePath)) || ("/textures/interface/2d".equals(nodePath))) || ("/art/2ditems/maps/atlasmaps".equals(nodePath))) || ("/art/2ditems/currency".equals(nodePath))) || ("/data".equals(nodePath));
}