public void updateMedia(@android.support.annotation.NonNull
br.com.renanmassaroto.manualimagesorganizer.v2.model.Media media, boolean includingFolder) {
    id = media.getId();
    if (includingFolder) {
        path = media.getPath();
        directory = media.getDirectory();
    }
    size = media.getSize();
    height = media.getHeight();
    width = media.getWidth();
    favorite = media.isFavorite();
    folderCover = media.isFolderCover();
    like = media.getLike();
}