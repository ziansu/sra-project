@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode == (android.app.Activity.RESULT_OK)) {
        if (requestCode == (PICK_IMAGE))
            new com.byteshaft.briver.fragments.RegisterFragment.ConvertImage().execute(data);
        else
            if (requestCode == (CAPTURE_IMAGE))
                onCaptureImageResult();
            
        
    }
}