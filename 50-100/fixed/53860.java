public it.musichub.server.library.model.Song getSong(java.nio.file.Path filePath) {
    if ((songs) != null) {
        for (it.musichub.server.library.model.Song s : songs) {
            try {
                if (java.nio.file.Files.isSameFile(s.getFile().toPath(), filePath))
                    return s;
                
            } catch (java.io.IOException e) {
            }
        }
    }
    return null;
}