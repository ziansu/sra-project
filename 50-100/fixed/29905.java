@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.app.FragmentManager childFragManager = getChildFragmentManager();
    android.app.FragmentTransaction tr = childFragManager.beginTransaction();
    for (android.app.Fragment frag : mFragments) {
        tr.add(R.id.fragcontainer, frag);
    }
    tr.commit();
}