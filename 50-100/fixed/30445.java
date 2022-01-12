void switchPanelMenu(valerino.vgcamera.MainActivity.OPERATION_MODE mode) {
    _mode = mode;
    _menu.clear();
    if (mode == (valerino.vgcamera.MainActivity.OPERATION_MODE.MODE_PREVIEW)) {
        getMenuInflater().inflate(R.menu.cam_menu, _menu);
        initializeOptionsMenu(_menu);
    }else {
        getMenuInflater().inflate(R.menu.taken_menu, _menu);
    }
}