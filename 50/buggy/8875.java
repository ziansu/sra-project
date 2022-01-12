@java.lang.Override
public void onClick(android.view.View v) {
    com.spatialdev.osm.model.OSMNode node = osmMap.addNode();
    toggleNodeMode();
    node.select();
    identifyOSMFeature(node);
}