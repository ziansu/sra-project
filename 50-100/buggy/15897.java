@java.lang.Override
public void onDestroyView() {
    android.util.Log.e("DEBUG", "onDestroyView of MapFragment");
    super.onDestroyView();
    com.google.android.gms.maps.MapFragment f = ((com.google.android.gms.maps.MapFragment) (getFragmentManager().findFragmentById(R.id.map)));
    if (f != null) {
        try {
            getFragmentManager().beginTransaction().remove(f).commit();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}