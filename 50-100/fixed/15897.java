@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    com.google.android.gms.maps.MapFragment f = ((com.google.android.gms.maps.MapFragment) (getFragmentManager().findFragmentById(R.id.map)));
    if (f != null) {
        getFragmentManager().beginTransaction().remove(f).commit();
    }
}