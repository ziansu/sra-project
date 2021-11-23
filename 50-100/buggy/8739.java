public void run() {
    if (!(args.isNull(0))) {
        java.lang.String inputMode_s = args.get(0);
        int inputMode_i = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING;
        if (inputMode.equals("pan")) {
            inputMode_i = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN;
        }else
            if (inputMode.equals("resize")) {
                inputMode_i = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE;
            }
        
        cordova.getActivity().getWindow().setSoftInputMode(inputMode_i);
    }else {
        callbackContext.error("No arguments found");
    }
    callbackContext.success();
}