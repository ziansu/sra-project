public java.io.File saveSongAs(java.io.File file) throws java.io.IOException {
    java.io.File song = saveSong(file.getName().replace(".caustic", ""));
    if (!(file.getParentFile().equals(song.getParentFile()))) {
        com.google.common.io.Files.move(song, file.getParentFile());
    }
    return file;
}