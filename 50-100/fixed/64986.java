@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.btn_capturevideo)) {
        startVideoCaptureActivity();
    }else
        if ((v.getId()) == (R.id.iv_thumbnail)) {
            playVideo();
        }else
            if ((v.getId()) == (R.id.btn_uploadvideo)) {
                uploadVideo();
            }
        
    
}