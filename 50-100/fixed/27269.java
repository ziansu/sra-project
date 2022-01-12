@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_best_of_past, container, false);
    lvToShow = ((android.widget.ListView) (view.findViewById(R.id.imgListView3)));
    android.widget.ArrayAdapter<com.parse.ParseObject> adapter;
    adapter = new com.example.user.singapics.BestOfPastFragment.BestOFPastAdapter(getActivity().getApplicationContext(), R.layout.photos_list, mBOP);
    lvToShow.setAdapter(adapter);
    return inflater.inflate(R.layout.fragment_best_of_past, container, false);
}