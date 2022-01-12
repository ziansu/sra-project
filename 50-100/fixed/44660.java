public static void setActive(int[] trpNums) {
    com.utyf.pmetro.map.TRP.clearActiveTRP();
    for (int tNum : trpNums)
        com.utyf.pmetro.map.TRP.addActive(tNum);
    
    synchronized(com.utyf.pmetro.map.TRP.rt) {
        com.utyf.pmetro.map.TRP.rt.createGraph();
        com.utyf.pmetro.map.TRP.setStart(com.utyf.pmetro.map.TRP.routeStart);
        com.utyf.pmetro.map.TRP.setEnd(com.utyf.pmetro.map.TRP.routeEnd);
    }
    MapActivity.mapActivity.setActiveTRP();
}