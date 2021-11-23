public void run() {
    int inputMode_i = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING;
    if (inputMode_s.equals("pan")) {
        inputMode_i = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN;
    }else
        if (inputMode_s.equals("resize")) {
            inputMode_i = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE;
        }
    
    cordova.getActivity().getWindow().setSoftInputMode(inputMode_i);
    callbackContext.success();
}