private static void loadFeatureSpace(java.lang.String filename) {
    try {
        java.io.BufferedReader r = new java.io.BufferedReader(new java.io.FileReader(filename));
        java.lang.String indices = r.readLine();
        java.lang.Integer i = 0;
        for (java.lang.String index : indices.split(", ")) {
            project6867.MarioML.features.put(java.lang.Integer.parseInt(index), i);
            i++;
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}