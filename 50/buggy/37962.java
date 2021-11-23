@java.lang.Override
protected void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.oneplus.camera.ui.PreviewGallery.MSG_START_BURST_CAPTURE :
            this.startBurstCapture();
            break;
        default :
            super.handleMessage(msg);
            break;
    }
}