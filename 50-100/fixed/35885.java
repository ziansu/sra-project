@java.lang.Override
public void onAttach(final android.content.Context context) {
    super.onAttach(context);
    try {
        mOnEndlessScrollListener = ((de.handler.mobile.android.fairmondo.presentation.interfaces.OnEndlessScrollListener) (context));
    } catch (final java.lang.Exception e) {
        android.util.Log.d(getClass().getCanonicalName(), "Your Activity has to implement OnEndlessScrollListener");
        e.printStackTrace();
    }
}