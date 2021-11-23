private void setCameraParameterSupported(int iParameter, boolean isSupported) {
    switch (iParameter) {
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_SCENE :
            mSceneModeSupported = isSupported;
            break;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_WB :
            mWBSupported = isSupported;
            break;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_FLASH :
            mFlashModeSupported = isSupported;
            break;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_FOCUS :
            mFocusModeSupported = isSupported;
            break;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_ISO :
            mISOSupported = isSupported;
            break;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_MET :
            mMeteringAreasSupported = isSupported;
            break;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_COLLOR_EFFECT :
            mCollorEffectsSupported = isSupported;
            break;
        case com.almalence.opencam.ui.AlmalenceGUI.MODE_CAM :
            mCameraChangeSupported = isSupported;
            break;
        default :
            break;
    }
}