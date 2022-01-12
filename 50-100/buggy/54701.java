@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.room_information_list_view, container, false);
    roomRecyclerView = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(R.id.room_information_list)));
    roomRecyclerView.setHasFixedSize(true);
    roomRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity().getBaseContext()));
    roomInformationAdapter = new com.thoughtworks.android.booking.Adapter.RoomInformationAdapter();
    roomRecyclerView.setAdapter(roomInformationAdapter);
    return rootView;
}