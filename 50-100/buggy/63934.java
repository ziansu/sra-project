private void saveScores() {
    java.io.PrintWriter pw;
    try {
        pw = new java.io.PrintWriter("scores.txt", "UTF-8");
        for (SunDevilDice.ScoreObj so : highScores) {
            java.lang.System.out.println((((so.name) + "\t") + (so.score)));
            pw.println((((so.name) + "\t") + (so.score)));
        }
        pw.close();
    } catch (java.lang.Exception exception) {
    }
}