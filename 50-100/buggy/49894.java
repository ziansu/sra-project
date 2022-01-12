@java.lang.Override
public void onDestroyView() {
    android.app.FragmentManager childFragManager = getChildFragmentManager();
    android.app.FragmentTransaction tr = childFragManager.beginTransaction();
    for (android.app.Fragment frag : mFragments) {
        tr.remove(frag);
    }
    tr.commit();
    super.onDestroyView();
}