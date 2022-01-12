private void traverseGraphClicked(java.lang.String centreNode, java.lang.String radius) {
    int centreNodeID = java.lang.Integer.parseInt(centreNode);
    drawer.changeZoom(((getEndColumn(centreNode, radius)) - (getStartColumn(centreNode, radius))), drawer.getColumnId(centreNodeID));
    sequenceInfo.setText(("Sequence: " + (sequenceHashMap.get(new java.lang.Long(centreNodeID)))));
}