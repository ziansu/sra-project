private boolean OnSameLine(java.lang.String stop1, java.lang.String stop2) {
    for (java.lang.String line1 : systemStops.get(stop1).GetLines()) {
        for (java.lang.String line2 : systemStops.get(stop2).GetLines()) {
            if (line1.equals(line2))
                return true;
            
        }
    }
    return false;
}