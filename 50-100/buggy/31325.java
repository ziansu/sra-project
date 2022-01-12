public void run() {
    if (action.equals("adjustPan"))
        cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
    else
        if (action.equals("adjustResize"))
            cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        else
            if (action.equals("adjustResize|stateVisible|stateAlwaysHidden"));
        
    
    cordova.getActivity().getWindow().setSoftInputMode((((WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE) | (WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)) | (WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)));
}