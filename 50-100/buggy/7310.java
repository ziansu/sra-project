public it.musichub.server.library.model.Folder getFolder(it.musichub.server.library.model.Folder folder) {
    if ((folders) != null) {
        for (it.musichub.server.library.model.Folder f : folders) {
            try {
                if (java.nio.file.Files.isSameFile(f.getFile().toPath(), folder.getFile().toPath()))
                    return f;
                
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
    return null;
}