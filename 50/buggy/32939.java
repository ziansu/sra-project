public void toggleMaxZoom() {
    if (valerino.vgcamera.AppConfiguration.instance(_context).maxZoomMode()) {
        setMaxZoom();
    }else {
        setZoom(0);
        _savedZoom = 0;
    }
}