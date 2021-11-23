public void multifloorUpdate() {
    java.lang.System.out.println(((("cf: " + (currentFloor)) + "   size: ") + (globalFragList.get(fragPathPos).size())));
    graph.wipeEdgeLines();
    floor_ChoiceBox.getSelectionModel().select(((currentFloor) - 1));
    java.lang.System.out.println(("creating edge lines for fp pos: " + (fragPathPos)));
    graph.createEdgeLines(globalFragList.get(fragPathPos));
}