@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.attendance_layout, container, false);
    recyclerView = ((com.jcodecraeer.xrecyclerview.XRecyclerView) (view.findViewById(R.id.kid_present_recycler_view)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    recyclerView.setAdapter(new com.example.a1.projecttest.vospitatel.adapters.AttendanceAdapter());
    return view;
}