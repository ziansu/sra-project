private void getSongs() {
    try {
        java.io.File file = new java.io.File("Songs.txt");
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file));
        java.lang.String line = null;
        while ((line = reader.readLine()) != null) {
            addSong(line);
        } 
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}