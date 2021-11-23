@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentTransaction ft = mFragmentManager.beginTransaction();
    ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
    ft.replace(R.id.frame_container, new babyfon.view.fragment.BabyMonitorFragment(mContext), null).addToBackStack(null).commit();
}