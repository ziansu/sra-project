public courier.TramLine findTramLine(courier.Station a, courier.Station b) {
    if ((a == null) || (b == null))
        return null;
    
    if (a.equals(b))
        return null;
    
    int index = findTramLineIndexNB(a, b);
    if (index >= 0) {
        return map.tramLines.get(index);
    }
    return null;
}