public static void loadArray(java.io.FileReader inputFile, java.util.ArrayList<java.lang.String> text) {
    java.lang.String line;
    int i = 0;
    java.io.BufferedReader br = new java.io.BufferedReader(inputFile);
    try {
        while ((line = br.readLine()) != null) {
            text.set(i, line);
            i++;
        } 
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(wordcloud.WordCloud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}