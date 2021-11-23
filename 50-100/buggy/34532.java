public void addHighScore(int score) {
    try {
        java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter("scores.txt", true));
        java.lang.System.out.println();
        writer.write(score);
        writer.newLine();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}