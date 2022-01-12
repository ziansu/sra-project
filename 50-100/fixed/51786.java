@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.sangcomz.fishbun.define.Define.TAKE_A_PICK_REQUEST_CODE)) {
        if (resultCode == (RESULT_OK)) {
            startFileMediaScan(pickerController.getSavePath());
            adapter.addImage(pickerController.getSavePath());
        }else {
            new java.io.File(pickerController.getSavePath()).delete();
        }
    }
}