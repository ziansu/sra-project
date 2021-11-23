@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (mUploadPicIV)) {
        loadPic.showSelectPicDialog(cameraProxy, this, this);
    }else
        if (v == (mUploadVideoIV)) {
        }else
            if (v == (mPublishActTV)) {
                publishAct();
            }else
                if (v == (mBackIB)) {
                    finish();
                }
            
        
    
}