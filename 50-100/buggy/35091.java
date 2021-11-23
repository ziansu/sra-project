@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof tpdev.megaphone.MessageListFragment.Listener) {
        mListener = ((tpdev.megaphone.MessageListFragment.Listener) (context));
        android.util.Log.w(com.google.android.gms.wearable.DataMap.TAG, "ATTACHING LISTENER");
    }else {
        throw new java.lang.RuntimeException(((context.toString()) + " must implement Listener"));
    }
}