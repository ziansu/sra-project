@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    fragmentView = inflater.inflate(R.layout.fragment_event, container, false);
    recyclerView = ((android.support.v7.widget.RecyclerView) (fragmentView.findViewById(R.id.event_list)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    return fragmentView;
}