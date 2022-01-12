private void addBlankConnection() {
    java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> connections = editingPoint.getNeighborPointsOnOtherMaps();
    java.lang.String mapName = "None";
    if (connections.containsKey(mapName))
        return ;
    
    java.lang.String nodeName = "";
    connections.get(mapName).clear();
    connections.get(mapName).add(nodeName);
    WPI.CampusMap.Frontend.NEEDS_TO_BE_SORTED.UI.ConnectionNodeElement element = new WPI.CampusMap.Frontend.NEEDS_TO_BE_SORTED.UI.ConnectionNodeElement(editingPoint, mapName, nodeName);
    displayPanel.add(element);
    displayPanel.revalidate();
    displayPanel.repaint();
}