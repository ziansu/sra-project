@butterknife.OnClick(value = R.id.dashboard_dash_instant)
public void openInstantView(com.chrisplus.muselogger.views.DashButtonView view) {
    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in_center, R.anim.fade_out_center, R.anim.fade_in_center, R.anim.fade_out_center).replace(R.id.main_container, com.chrisplus.muselogger.fragments.InstantViewFragment.newInstance(currentMuse)).addToBackStack(com.chrisplus.muselogger.fragments.InstantViewFragment.class.getSimpleName()).commit();
}