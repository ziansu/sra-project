void saveScore(java.util.ArrayList<java.lang.String> input) {
    java.io.File scores = new java.io.File("scores.txt");
    try {
        java.io.FileWriter writer;
        writer = new java.io.FileWriter(scores, true);
        for (java.lang.String s : input) {
            writer.write((s + "\n"));
        }
        writer.flush();
        writer.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}