public void findTracks() {
    java.io.File file = new java.io.File(com.tim10011001.untitled.data.workes.Worker.sdRoot, "Music");
    for (java.io.File f : file.listFiles()) {
        if (f.getAbsolutePath().endsWith(".mp3"))
            com.tim10011001.untitled.data.workes.Worker.tracksUri.add(f.toURI());
        
        android.util.Log.d("Music", f.getAbsolutePath());
    }
}