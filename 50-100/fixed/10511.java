@java.lang.Override
public void onTriggered() {
    if ((tilemap) != null) {
        int[] dims = getNumberPair("Please enter the new dimensions?");
        if (dims == null)
            return ;
        
        for (int i = 0; i < (tilemap.getLayerCount()); i++) {
            tilemap.getLayer(i).resize(dims[0], dims[1]);
        }
    }
}