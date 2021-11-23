public void traverseGraphClicked() {
    int centreNodeID = java.lang.Integer.parseInt(getNodeTextField().getText());
    drawer.changeZoom(((getEndColumn()) - (getStartColumn())), drawer.getColumnId(centreNodeID));
    sequenceInfo.setText(("Sequence: " + (sequenceHashMap.get(centreNodeID))));
}