@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mListener = ((com.cuberob.wearaccuracy.interfaces.SendMessageListener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((activity.toString()) + " must implement SendMessageListener"));
    }
    com.google.android.gms.common.api.GoogleApiClient googleApiClient = ((com.cuberob.wearaccuracy.activities.BaseActivity) (getActivity())).getGoogleApiClient();
    if (googleApiClient == null) {
        android.util.Log.d(com.cuberob.wearaccuracy.fragments.VibrationTestFragment.TAG, "was null");
        return ;
    }
}