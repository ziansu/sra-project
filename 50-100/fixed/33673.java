@java.lang.Override
public void onManagerConnected(int status) {
    switch (status) {
        case org.opencv.android.LoaderCallbackInterface.SUCCESS :
            {
                faceDetector = new pl.polsl.wkiro.facerecognizer.model.FaceDetector(this);
                pl.polsl.wkiro.facerecognizer.model.PictureHolder ph = pl.polsl.wkiro.facerecognizer.model.PictureHolder.getInstance();
                frameRgba = ph.getFrameRgba();
                frameGray = ph.getFrameGray();
                faces = faceDetector.detectFaces(frameGray);
                createFacesForm();
            }
            break;
        default :
            {
                super.onManagerConnected(status);
            }
            break;
    }
}