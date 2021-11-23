@java.lang.Override
protected java.lang.Void doInBackground(org.opencv.core.Mat... params) {
    boolean found = org.opencv.calib3d.Calib3d.findChessboardCorners(params[0], _boardSize, _corners, ((org.opencv.calib3d.Calib3d.CALIB_CB_FAST_CHECK) + (org.opencv.calib3d.Calib3d.CALIB_USE_LU)));
    org.opencv.calib3d.Calib3d.drawChessboardCorners(params[0], _boardSize, _corners, found);
    return null;
}