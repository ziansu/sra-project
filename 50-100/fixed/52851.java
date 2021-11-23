public it.musichub.server.library.model.Song getSong(it.musichub.server.library.model.Song song) {
    if ((songs) != null) {
        for (it.musichub.server.library.model.Song s : songs) {
            try {
                if (java.nio.file.Files.isSameFile(s.getFile().toPath(), song.getFile().toPath()))
                    return s;
                
            } catch (java.io.IOException e) {
            }
        }
    }
    return null;
}