private void writeAudio(java.io.File file) throws java.io.FileNotFoundException {
    try (java.io.PrintWriter printWriter = new java.io.PrintWriter(file)) {
        for (java.lang.Integer s : Main.setAudio) {
            if (Main.allSenIdsSet.contains(s.toString())) {
                printWriter.println(s);
            }
        }
    }
}