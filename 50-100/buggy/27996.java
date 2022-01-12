@java.lang.Override
public void modify() {
    if ((mPhoto.getJpeg()) == null) {
        return ;
    }
    mPhoto.updateRotationDeltaBy(((mRotationDegrees) - (mPhoto.getRotationForDisplay())));
    mPhoto.setRotationForDisplay(mRotationDegrees);
    mPhoto.updateExif();
}