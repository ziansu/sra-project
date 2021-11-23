public static void destroyPicture() {
    new java.io.File(nl.hanze.myhealth.Camera.mCurrentPhotoPath).delete();
    nl.hanze.myhealth.Camera.mCurrentPhotoPath = null;
}