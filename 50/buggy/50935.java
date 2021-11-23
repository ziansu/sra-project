@java.lang.Override
public void onClick(android.view.View v) {
    getCamera();
    if (FlashOn) {
        TurnOffFlash();
    }else {
        TurnOnFlash();
    }
}