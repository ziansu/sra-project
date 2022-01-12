private void setCameraParameterSupported(int iParameter, boolean isSupported) {
    switch (iParameter) {
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_SCENE :
            mSceneModeSupported = isSupported;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_WB :
            mWBSupported = isSupported;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_FLASH :
            mFlashModeSupported = isSupported;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_FOCUS :
            mFocusModeSupported = isSupported;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_ISO :
            mISOSupported = isSupported;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_MET :
            mMeteringAreasSupported = isSupported;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_COLLOR_EFFECT :
            mCollorEffectsSupported = isSupported;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_CAM :
            mCameraChangeSupported = isSupported;
        default :
            break;
    }
}