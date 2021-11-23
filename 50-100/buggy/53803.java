private void writeAudio(java.io.File file) throws java.io.FileNotFoundException {
    try (java.io.PrintWriter printWriter = new java.io.PrintWriter(file)) {
        for (java.lang.String s : Main.setAudio) {
            if (Main.allSenIdsSet.contains(s)) {
                printWriter.println(s);
            }
        }
    }
}