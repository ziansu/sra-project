private void initiatePicker(final android.app.Activity activity) {
    try {
        com.imnjh.imagepicker.SImagePicker.from(activity).maxCount(1000).rowCount(5).pickMode(SImagePicker.MODE_IMAGE).forResult(com.reactnative.ivpusic.imagepicker.PickerModule.REQUEST_CODE_IMAGE);
    } catch (java.lang.Exception e) {
        resultCollector.notifyProblem(com.reactnative.ivpusic.imagepicker.PickerModule.E_FAILED_TO_SHOW_PICKER, e);
    }
}