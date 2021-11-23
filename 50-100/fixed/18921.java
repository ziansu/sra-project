@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        location = new com.geoculturedemo.nickstamp.geoculturedemo.Utils.LocationUtils(getContext()).toGreekLocale(((com.geoculturedemo.nickstamp.geoculturedemo.Model.Location) (getArguments().getSerializable(com.geoculturedemo.nickstamp.geoculturedemo.Fragment.SongListFragment.ARG_LOCATION))));
    }
}