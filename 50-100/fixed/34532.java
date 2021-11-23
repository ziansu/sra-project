public void addHighScore(int score) {
    try {
        java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter("scores.txt", true));
        writer.write(score);
        writer.newLine();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}