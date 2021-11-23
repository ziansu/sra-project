public java.lang.String getLastSaved() {
    java.io.FileInputStream fis = null;
    java.lang.String lastSongSaved = "0";
    try {
        fis = openFileInput("lastSong");
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
        lastSongSaved = java.lang.String.valueOf(ois.readInt());
        ois.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.StreamCorruptedException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return lastSongSaved;
}