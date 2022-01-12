public void writeInTextFile(java.lang.String playerInfo, int fileNumber) {
    java.lang.String filePath = java.lang.String.format((("resources\\PlayerFiles\\" + fileNumber) + ".txt"));
    try {
        java.io.PrintWriter writer;
        writer = new java.io.PrintWriter(filePath);
        writer.print(playerInfo);
        writer.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}