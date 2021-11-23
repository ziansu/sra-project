private void showAboutZanteDialog() {
    android.util.Log.v("HELLO", "HELLLO");
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    android.app.Fragment prev = getFragmentManager().findFragmentByTag("shownDialog");
    if (prev != null) {
        ft.remove(prev);
    }
    ft.addToBackStack(null);
    extinctspecie.com.zantetravel.activities.MainActivity.newFragment = extinctspecie.com.zantetravel.fragments.MyDialogFragment.newInstance(extinctspecie.com.zantetravel.activities.MainActivity.CUSTOM_DIALOG_ID_FOR_ABOUT_APP);
    extinctspecie.com.zantetravel.activities.MainActivity.newFragment.setCancelable(true);
    extinctspecie.com.zantetravel.activities.MainActivity.newFragment.show(ft, "shownDialog");
}