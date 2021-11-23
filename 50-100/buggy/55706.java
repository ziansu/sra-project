@java.lang.Override
public void cameraInOperation(boolean in_operation) {
    if (MyDebug.LOG)
        android.util.Log.d(vn.mbm.phimp.me.opencamera.MyApplicationInterface.TAG, ("cameraInOperation: " + in_operation));
    
    if ((!in_operation) && (used_front_screen_flash)) {
        main_activity.setBrightnessForCamera(false);
        used_front_screen_flash = false;
    }
    drawPreview.cameraInOperation(in_operation);
    main_activity.getMainUI().showGUI((!in_operation));
}