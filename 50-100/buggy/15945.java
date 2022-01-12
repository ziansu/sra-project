@java.lang.Override
public void onClick(android.view.View v) {
    if (com.aidanas.torch.Const.DEBUG)
        android.util.Log.v(com.aidanas.torch.fragments.MainFragment.TAG, ("In onClick(), isLightOn = " + (isLightOn)));
    
    if (isLightOn) {
        lightOn((!(isLightOn)));
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        btn.setText(R.string.ma_btn_txt_lights_up);
        isLightOn = false;
    }else {
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        lightOn((!(isLightOn)));
        btn.setText(R.string.ma_btn_txt_lights_down);
        isLightOn = true;
    }
}