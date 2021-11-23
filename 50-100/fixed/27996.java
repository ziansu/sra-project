@java.lang.Override
public void modify() {
    if ((mPhoto.getJpeg()) == null) {
        return ;
    }
    synchronized(mPhoto) {
        mPhoto.updateRotationDeltaBy(((mRotationDegrees) - (mPhoto.getRotationForDisplay())));
        mPhoto.setRotationForDisplay(mRotationDegrees);
        mPhoto.updateExif();
    }
}