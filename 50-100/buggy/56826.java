@java.lang.Override
protected java.lang.Void doInBackground(org.opencv.core.Mat... params) {
    boolean found = org.opencv.calib3d.Calib3d.findChessboardCorners(params[0], _boardSize, _corners, ((org.opencv.calib3d.Calib3d.CALIB_CB_FAST_CHECK) + (org.opencv.calib3d.Calib3d.CALIB_USE_LU)));
    if (found) {
        double approxDistance = (org.opencv.imgproc.Imgproc.arcLength(_corners, true)) * 0.02;
        org.opencv.imgproc.Imgproc.approxPolyDP(_corners, _approxCurve, approxDistance, true);
        org.opencv.calib3d.Calib3d.drawChessboardCorners(params[0], _boardSize, _corners, found);
    }
    return null;
}