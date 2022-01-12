public void addColorTo(metro.TrainManagement.Nodes.RailwayNode node, java.awt.Color color) {
    if (!(_mapOfColors.containsKey(node)))
        _mapOfColors.put(node, new java.util.ArrayList<java.awt.Color>());
    
    _mapOfColors.get(node).add(color);
}