public void onClick(com.ihongqiqu.camera.View view) {
    switch (view.getId()) {
        case R.id.shutter_btn :
            takePicture(this, null, this);
            break;
        case R.id.zoom_down_btn :
            zoomDown();
            break;
        case R.id.zoom_up_btn :
            zoomUp();
            break;
        case R.id.torch_switch_btn :
            toggleTorch();
            break;
        case R.id.choose_picture_btn :
            choosePicture();
            break;
        default :
            break;
    }
}