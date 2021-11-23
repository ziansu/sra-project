public java.lang.String getVideoDefinitionCategory() {
    int w = this.videoWidth;
    int h = this.videoHeight;
    if ((w == 0) || (h == 0)) {
        return "";
    }else
        if ((w <= 640) && (h <= 360)) {
            return org.tinymediamanager.core.entities.MediaFile.VIDEO_FORMAT_LD;
        }else
            if ((w < 1280) && (h < 720)) {
                return org.tinymediamanager.core.entities.MediaFile.VIDEO_FORMAT_SD;
            }
        
    
    return org.tinymediamanager.core.entities.MediaFile.VIDEO_FORMAT_HD;
}