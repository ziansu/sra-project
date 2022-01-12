private void formatCSV(java.lang.String fileName, java.lang.String outFileName) {
    try {
        java.lang.String cmd = (("python geocoder.py " + fileName) + " ") + (ourFileName);
        java.lang.Process p = java.lang.Runtime.getRuntime().exec(cmd);
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Failed to read file.");
    }
}