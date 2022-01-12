private void updateEdgeList(edu.bridgewater.mcmaze.Edge e) {
    int realFirstNode = e.getSecondNode();
    int realSecondNode = e.getFirstNode();
    e.setFirstNode(realFirstNode);
    e.setSecondNode(realSecondNode);
    if (edu.bridgewater.mcmaze.GUIScreens.edgeConfirmed) {
        edgeList.add(e);
        genOutputRoomInfo(e);
    }else {
        edgeList.remove(((edgeList.size()) - 1));
        edgeList.add(e);
        genOutputRoomInfo(e);
    }
}