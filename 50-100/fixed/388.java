private void formatCSV(java.lang.String fileName, java.lang.String outFileName) {
    try {
        java.lang.String cmd = (("python geocoder.py " + fileName) + " ") + outFileName;
        java.lang.Process p = java.lang.Runtime.getRuntime().exec(cmd);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Failed to read file.");
    }
}