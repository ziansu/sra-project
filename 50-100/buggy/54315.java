@java.lang.Override
public void onClick(cn.pedant.SweetAlert.SweetAlertDialog sweetAlertDialog) {
    dialog.dismiss();
    android.support.v4.app.Fragment fragment = new com.idbi.idbi.ui.Homestack.HomeStackFragment();
    android.support.v4.app.FragmentManager fragmentManager = ((com.idbi.idbi.ui.activities.DashboardActivity) (com.idbi.idbi.ui.bicalculator.MainActivity.context)).getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.frame_ActivityFragmentContainer_container, fragment);
    fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}