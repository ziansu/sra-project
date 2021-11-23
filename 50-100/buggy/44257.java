@java.lang.Override
public void onClick(android.view.View view) {
    final com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.util.DialogSelectCamOrPic Dcamgallery = new com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.util.DialogSelectCamOrPic(getActivity(), appSession, null);
    Dcamgallery.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {
        @java.lang.Override
        public void onDismiss(android.content.DialogInterface dialog) {
            if ((Dcamgallery.getButtonTouch()) == (Dcamgallery.TOUCH_CAM)) {
                dispatchTakePictureIntent();
            }else
                if ((Dcamgallery.getButtonTouch()) == (Dcamgallery.TOUCH_GALLERY)) {
                    loadImageFromGallery();
                }else {
                }
            
        }
    });
}