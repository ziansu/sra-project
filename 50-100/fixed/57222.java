private thesis.core.common.WorldCoordinate computeRoadFromNode(thesis.core.common.WorldCoordinate root, thesis.worldgen.KDNode node, boolean isVertical) {
    thesis.core.common.WorldCoordinate intersection = null;
    if (isVertical) {
        intersection = new thesis.core.common.WorldCoordinate(node.getLocation().getNorth(), root.getEast());
    }else {
        intersection = new thesis.core.common.WorldCoordinate(root.getNorth(), node.getLocation().getEast());
    }
    return intersection;
}