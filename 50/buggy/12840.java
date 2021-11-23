@java.lang.Override
public void onAttachFragment(android.support.v4.app.Fragment fragment) {
    fragList.add(new java.lang.ref.WeakReference<android.support.v4.app.Fragment>(fragment));
}