@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    final android.view.View view = inflater.inflate(R.layout.fragment_images, container, false);
    recyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recyclerviewPhotos)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    fireBaseClient = new com.example.gerardo.free.FireDataBase.FireBaseClient(getContext().getApplicationContext(), com.example.gerardo.free.Fragments.FragmentImages.DB_URL, recyclerView);
    fireBaseClient.refreshData();
    return view;
}