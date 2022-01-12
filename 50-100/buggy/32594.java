private static void loadFeatureSpace(java.lang.String filename) {
    try {
        java.io.BufferedReader r = new java.io.BufferedReader(new java.io.FileReader(filename));
        java.lang.String indices = r.readLine();
        for (java.lang.String index : indices.split(", ")) {
            project6867.MarioML.features.add(java.lang.Integer.parseInt(index));
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}