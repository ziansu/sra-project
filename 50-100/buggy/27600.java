public void resetSnapshot() {
    final java.util.List<com.net2plan.interfaces.networkDesign.NetworkLayer> networkLayers = netPlan.getNetworkLayers();
    layerList.clear();
    aux_layerToGUI.clear();
    for (com.net2plan.interfaces.networkDesign.NetworkLayer networkLayer : networkLayers) {
        com.net2plan.gui.plugins.networkDesign.visualizationControl.GUILayer guiLayer = new com.net2plan.gui.plugins.networkDesign.visualizationControl.GUILayer(networkLayer);
        layerList.add(guiLayer);
        aux_layerToGUI.put(networkLayer, guiLayer);
    }
}