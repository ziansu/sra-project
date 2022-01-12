@java.lang.Override
public void _save() {
    if ((picture) == null) {
        deletePicture();
    }else {
        if ((fileId) != (picture.getUUID())) {
            deletePicture();
            fileId = picture.getUUID();
        }
    }
    super._save();
}