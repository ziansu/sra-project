@java.lang.Override
public void onAttach(final android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mOnEndlessScrollListener = ((de.handler.mobile.android.fairmondo.presentation.interfaces.OnEndlessScrollListener) (activity));
    } catch (final java.lang.Exception e) {
        android.util.Log.d(getClass().getCanonicalName(), "Your Activity has to implement OnEndlessScrollListener");
        e.printStackTrace();
    }
}