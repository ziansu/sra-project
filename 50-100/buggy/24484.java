@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    sp = new com.linhnv.foodsy.model.SP(getActivity());
    listPlace = new java.util.ArrayList<>();
    latitude = sp.getLatitude();
    longitude = sp.getLongitude();
    new com.linhnv.foodsy.fragment.MapFragment.LoadPlaceAround().execute(sp.getToken(), java.lang.String.valueOf(latitude), java.lang.String.valueOf(longitude));
}