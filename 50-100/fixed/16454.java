public void enableFabs(boolean show) {
    if (!show) {
        trackingFab.hide();
        uploadFab.hide();
        uploadFabHidden = true;
    }else {
        trackingFab.show();
        if (uploadAvailable)
            uploadFab.show();
        
        uploadFabHidden = false;
    }
}