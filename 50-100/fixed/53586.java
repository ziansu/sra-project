public void writeHighScores() throws java.io.IOException {
    if (!(this.isHighScore()))
        return ;
    
    java.util.List<java.lang.String> strings = newHighScoresToString();
    java.io.PrintWriter writer = new java.io.PrintWriter(((this.difficultyToString().toLowerCase()) + ".txt"));
    for (java.lang.String s : strings)
        writer.println(s);
    
    writer.close();
}