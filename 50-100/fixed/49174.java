private java.util.List<edu.berkeley.nwbqueryengine.query.Expression> leftSideOfTree() {
    if ((expressionsLeftSide) == null) {
        expressionsLeftSide = new java.util.LinkedList<>();
        leftListsViewInternal(expressionsLeftSide, root, 1, 0, true);
        leftSide = expressionsLeftSide.get(0);
    }
    return expressionsLeftSide;
}