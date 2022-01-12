@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fragmentManager2 = getFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
    com.wvs.shoppercrux.activities.LocationActivity fragment2 = new com.wvs.shoppercrux.activities.LocationActivity();
    fragmentTransaction2.addToBackStack("xyz");
    fragmentTransaction2.hide(this);
    fragmentTransaction2.add(R.id.content_frame, fragment2);
    fragmentTransaction2.commit();
}