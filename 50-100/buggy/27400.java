public boolean directoryFilter(final com.github.poeatlas.cli.ggpk.DirectoryNode node) {
    final java.lang.String nodePath = node.getPath().toLowerCase();
    return ((((nodePath.equals("/art/2dart/atlas")) || (nodePath.equals("/textures/interface/2d"))) || (nodePath.equals("/art/2ditems/maps/atlasmaps"))) || (nodePath.equals("/art/2ditems/currency"))) || (nodePath.equals("/data"));
}