public void writeSMToFile(java.lang.String path) {
    try {
        java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter(path));
        for (stableMarriage.Man m : manList) {
            out.write(m.toString());
        }
        out.close();
    } catch (java.io.IOException e) {
    }
}