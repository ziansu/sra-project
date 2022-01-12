private com.mycompany.behear.StatArea getStatArea(com.mycompany.behear.Point point) {
    if ((com.mycompany.behear.MainActivity.statAreaTable) == null)
        return null;
    
    for (com.mycompany.behear.StatArea curStat : MainActivity.statAreaTable.values()) {
        if (curStat.getPolygon().isPointInPolygon(point)) {
            return curStat;
        }
    }
    return null;
}