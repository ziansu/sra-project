public java.lang.String getHighScore() {
    java.io.FileReader readFile = null;
    java.io.BufferedReader reader = null;
    try {
        readFile = new java.io.FileReader("highscore.dat");
        reader = new java.io.BufferedReader(readFile);
        return reader.readLine();
    } catch (java.lang.Exception e) {
        return "Nobody:0";
    } finally {
        try {
            if (reader != null)
                reader.close();
            
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}