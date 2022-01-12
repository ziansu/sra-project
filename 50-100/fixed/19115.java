private void updateEdgeList(edu.bridgewater.mcmaze.Edge e) {
    if (edu.bridgewater.mcmaze.GUIScreens.edgeConfirmed) {
        edgeList.add(e);
        genOutputRoomInfo(e);
    }else {
        edgeList.remove(((edgeList.size()) - 1));
        edgeList.add(e);
        genOutputRoomInfo(e);
    }
}