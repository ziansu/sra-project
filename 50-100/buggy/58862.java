public courier.TramLine findTramLine(courier.Station a, courier.Station b) {
    if ((a.equals(b)) || (b == null))
        return null;
    
    int index = findTramLineIndexNB(a, b);
    if (index >= 0) {
        return map.tramLines.get(index);
    }
    return null;
}