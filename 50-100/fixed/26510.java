@butterknife.OnClick(value = { R.id.multiCaptureButton , R.id.multiPickerButton , R.id.customThemeButton , R.id.btn_upload , R.id.view_results , R.id.message , R.id.github })
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.multiCaptureButton :
            if (com.arun.snap2sight.cam.utils.Utils.hasCameraHardware(this))
                initiateMultiCapture();
            else
                com.arun.snap2sight.cam.utils.Utils.showLongSnack(parentLayout, "Sorry. Your device does not have a camera.");
            
            break;
        case R.id.multiPickerButton :
            initiateMultiPicker();
            break;
        case R.id.btn_upload :
            upload();
            break;
        case R.id.view_results :
            viewResults();
            break;
    }
}