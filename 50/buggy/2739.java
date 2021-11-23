@butterknife.OnClick(value = R.id.fab_camera)
public void takePhoto() {
    try {
        com.collage.camera.CameraFragment.imageFile = createImageFile();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    lockFocus();
}