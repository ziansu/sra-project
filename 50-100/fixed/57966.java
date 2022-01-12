private static boolean check_heuristics(model.node node, java.util.ArrayList<java.util.HashMap<enums.CoordinateBox, model.coordinate>> boxes) {
    if (boxes == null)
        return true;
    
    for (java.util.HashMap<enums.CoordinateBox, model.coordinate> box : boxes)
        if (core.dijkstra.isInBox(box, node))
            return true;
        
    
    return false;
}