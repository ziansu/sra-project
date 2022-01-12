@android.support.annotation.Nullable
@java.lang.Override
public com.objectivetruth.uoitlibrarybooking.userinterface.calendar.View onCreateView(com.objectivetruth.uoitlibrarybooking.userinterface.calendar.LayoutInflater inflater, @android.support.annotation.Nullable
final com.objectivetruth.uoitlibrarybooking.userinterface.calendar.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    ((com.objectivetruth.uoitlibrarybooking.app.UOITLibraryBookingApp) (getActivity().getApplication())).getComponent().inject(this);
    setHasOptionsMenu(true);
    com.objectivetruth.uoitlibrarybooking.userinterface.calendar.View view = inflater.inflate(R.layout.calendar, container, false);
    _mSwipeLayout = ((android.support.v4.widget.SwipeRefreshLayout) (view.findViewById(R.id.calendar_swipe_refresh_layout)));
    return view;
}