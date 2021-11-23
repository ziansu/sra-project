public void onload(java.io.File nodes, java.io.File roads, java.io.File segments, java.io.File polygons) {
    nodeMap = new java.util.HashMap<>();
    roadMap = new java.util.HashMap<>();
    polygonSet = new java.util.HashSet<>();
    segmentSet = new java.util.HashSet<>();
    roadTrie = new code.comp261.ass1.RoadTrie();
    loadNodes(nodes);
    loadRoads(roads);
    java.lang.System.out.println("run road  sucess");
    loadSegments(segments);
    if (polygons == null)
        return ;
    
    loadPolygons(polygons);
}