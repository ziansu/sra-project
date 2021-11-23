public void ShowHome() {
    android.app.Fragment buttons = ((android.app.Fragment) (getFragmentManager().findFragmentById(R.id.FragmentButtons)));
    android.app.Fragment addBGL = ((android.app.Fragment) (getFragmentManager().findFragmentById(R.id.FragmentBGL)));
    android.app.Fragment bgl_frag = ((android.app.Fragment) (getFragmentManager().findFragmentByTag("BGL_FRAGMENT")));
    team5.diabetesself_managmentapp.AddBGLHelper.hideFragment(getFragmentManager(), addBGL);
    team5.diabetesself_managmentapp.AddBGLHelper.showFragment(getFragmentManager(), buttons);
    AddBGLFragment.bglAdapter.clearList();
}