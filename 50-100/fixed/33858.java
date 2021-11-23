private void acceptVideo(byte[] src, byte[] dst) {
    int directionFlag = ((currentCamera) == (Camera.CameraInfo.CAMERA_FACING_BACK)) ? resCoreParameters.backCameraDirectionMode : resCoreParameters.frontCameraDirectionMode;
    long a = java.lang.System.currentTimeMillis();
    me.lake.librestreaming.core.ColorHelper.NV21Transform(src, dst, resCoreParameters.previewVideoWidth, resCoreParameters.previewVideoHeight, directionFlag);
}