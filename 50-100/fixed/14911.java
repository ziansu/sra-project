@java.lang.Override
public android.net.Uri getImageUri() {
    if (((media) != null) && (media.hasEmbeddedPicture())) {
        return media.getImageUri();
    }else
        if (hasItemImageDownloaded()) {
            return image.getImageUri();
        }else
            if ((feed) != null) {
                return feed.getImageUri();
            }else {
                return null;
            }
        
    
}