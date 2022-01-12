@java.lang.Override
public void _save() {
    if (((fileId) == null) || (((picture) != null) && (!(fileId.equals(picture.getUUID()))))) {
        deletePicture();
        fileId = picture.getUUID();
    }
    super._save();
}