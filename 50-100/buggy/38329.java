@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == (com.kbeanie.multipicker.api.Picker.PICK_IMAGE_DEVICE)) {
            kProgressHUD = com.kaopiz.kprogresshud.KProgressHUD.create(this).setStyle(KProgressHUD.Style.SPIN_INDETERMINATE).setDetailsLabel("Downloading data").setCancellable(false).setAnimationSpeed(2).setDimAmount(0.5F).show();
            imagePicker.submit(data);
            imagePicker.submit(data);
        }
    }
}