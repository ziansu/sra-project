@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstance) {
    android.view.View rootView = inflater.inflate(R.layout.library_list_fragment, container, false);
    songs = new java.util.ArrayList<au.com.raicovtechnologyservices.musaique.Song>();
    getSongData();
    mediaPlayer = new au.com.raicovtechnologyservices.musaique.CustomPlayer();
    mLibraryList = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(R.id.library_list_view)));
    mLibraryLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    mLibraryList.setLayoutManager(mLibraryLayoutManager);
    return rootView;
}