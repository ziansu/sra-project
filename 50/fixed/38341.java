private java.lang.String getOppositeAlgo(java.lang.String algo) {
    if ("HSV".equals(algo)) {
        return "Rgb";
    }else
        if ("Rgb".equals(algo)) {
            return "HSV";
        }
    
    return algo;
}