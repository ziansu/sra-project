private void initalizeWriter() {
    java.io.File f = new java.io.File(originalPN);
    if ((f.exists()) && (!(f.isDirectory()))) {
        f.delete();
    }
    try {
        java.io.FileWriter fWrtr = new java.io.FileWriter(generateNextPath(true));
        out = new java.io.PrintWriter(fWrtr);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}