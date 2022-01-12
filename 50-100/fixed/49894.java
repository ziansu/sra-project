@java.lang.Override
public void onDestroyView() {
    android.app.FragmentManager childFragManager = getChildFragmentManager();
    for (android.app.Fragment frag : mFragments) {
        android.app.FragmentTransaction tr = childFragManager.beginTransaction();
        tr.remove(frag);
        tr.commit();
    }
    super.onDestroyView();
}