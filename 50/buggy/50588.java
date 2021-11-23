public com.jph.takephoto.app.TakePhoto getTakePhoto() {
    if ((takePhoto) == null) {
        takePhoto = new com.jph.takephoto.app.TakePhotoImpl(getActivity(), this);
    }
    return takePhoto;
}