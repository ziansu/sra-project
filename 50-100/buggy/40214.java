private java.io.BufferedWriter getWriter(java.lang.String routeId, boolean doAppend) throws java.lang.Exception {
    java.lang.String filePathString = (((dirForResults) + "/") + routeId) + "_travelTimes.txt";
    java.io.FileWriter fstream;
    java.io.File f = new java.io.File(filePathString);
    if (f.exists()) {
        fstream = new java.io.FileWriter(filePathString, doAppend);
    }else {
        fstream = new java.io.FileWriter(filePathString);
    }
    return new java.io.BufferedWriter(fstream);
}