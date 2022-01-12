@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    try {
        mCallBack = ((com.example.user.onceuponatime.fragment.SignInFragment.SignInFragmentCallBack) (context));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((context.toString()) + " must implements SignInCallaback"));
    }
}