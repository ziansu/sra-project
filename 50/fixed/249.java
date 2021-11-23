private boolean InSystem(java.lang.String stopName) {
    for (java.lang.String key : systemStops.keySet()) {
        if (stopName.equals(key))
            return true;
        
    }
    return false;
}