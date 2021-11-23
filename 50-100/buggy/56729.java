@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    super.onCreate(savedInstanceState);
    if ((getArguments().getInt(barrylui.nycbball.RecycleView.ARG_SECTION_NUMBER)) == (-1)) {
        barrylui.nycbball.CourtsRecycleView activity = ((barrylui.nycbball.CourtsRecycleView) (getActivity()));
        double curLat = activity.getcurLat();
        double curLng = activity.getcurLng();
        compareLatLng(curLat, curLng);
    }
    setRetainInstance(true);
}