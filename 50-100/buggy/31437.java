@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.gallery, container, false);
    mGrid = ((android.widget.GridView) (view.findViewById(R.id.grid)));
    mGrid.setAdapter(new com.dk.sample.folder.residemenu.GalleryFragment.SampleGridViewAdapter(getActivity()));
    mGrid.setFocusable(false);
    return view;
}