@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (mUploadPicIV)) {
        showSelectPicDialog();
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