@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof tpdev.megaphone.MessageListFragment.Listener) {
        mListener = ((tpdev.megaphone.MessageListFragment.Listener) (context));
    }else {
        throw new java.lang.RuntimeException(((context.toString()) + " must implement Listener"));
    }
}