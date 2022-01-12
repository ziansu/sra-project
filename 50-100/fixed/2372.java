private void changeCameraRatio() {
    switch (mCurrentRatio) {
        case com.meitu.camerademo.CameraFragment.CAMERA_RATIO_1_1 :
            mCurrentRatio = com.meitu.camerademo.CameraFragment.CAMERA_RATIO_FULL;
            mIvCameraRationChange.setImageResource(R.drawable.camera_picture_ratio_full_iv_ic_sel);
            break;
        case com.meitu.camerademo.CameraFragment.CAMERA_RATIO_4_3 :
            mIvCameraRationChange.setImageResource(R.drawable.camera_picture_ratio_11_iv_ic_sel);
            mCurrentRatio = com.meitu.camerademo.CameraFragment.CAMERA_RATIO_1_1;
            break;
        case com.meitu.camerademo.CameraFragment.CAMERA_RATIO_FULL :
            mIvCameraRationChange.setImageResource(R.drawable.camera_picture_ratio_43_iv_ic_sel);
            mCurrentRatio = com.meitu.camerademo.CameraFragment.CAMERA_RATIO_4_3;
            break;
    }
    if (((mCurrentRatio) == (com.meitu.camerademo.CameraFragment.CAMERA_RATIO_4_3)) || ((mCurrentRatio) == (com.meitu.camerademo.CameraFragment.CAMERA_RATIO_FULL))) {
        changePreviewSize();
    }else {
        resetCameraPreviewSize();
    }
}