@java.lang.Override
public void onClick(android.view.View v) {
    mCamera.takePicture(null, null, jpegCallBack);
    if ((firstPicTaken) == false) {
        zeroAzimuth = azimuth;
        firstPicTaken = true;
    }
    mCamera.startPreview();
}