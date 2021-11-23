public static FaceDetector.Face[] getFacesFromImage(android.graphics.Bitmap bmp) {
    android.media.FaceDetector fd = new android.media.FaceDetector(bmp.getWidth(), bmp.getHeight(), projekt_android.photoeditor.face_editing.FaceEditor.MAX_FACES);
    android.media.FaceDetector[] faces = new android.media.FaceDetector.Face[projekt_android.photoeditor.face_editing.FaceEditor.MAX_FACES];
    bmp = bmp.copy(Bitmap.Config.RGB_565, false);
    int faces_found_count = fd.findFaces(bmp, faces);
    if (faces_found_count > 0) {
        return faces;
    }else {
        return null;
    }
}