@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if (com.aidanas.torch.Const.DEBUG)
        android.util.Log.v(com.aidanas.torch.fragments.MainFragment.TAG, "In onSaveInstanceState()");
    
    outState.putBoolean(com.aidanas.torch.fragments.MainFragment.IS_LIGHT_ON, isLightOn);
    outState.putInt(com.aidanas.torch.fragments.MainFragment.OLD_ORIENTATION, oldOrientation);
}