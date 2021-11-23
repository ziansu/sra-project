@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.memory_add_wrapper, container, false);
    butterknife.ButterKnife.bind(this, view);
    _selectedItem = ((com.oneupapplications.bucketapp.API.DataModel.Memory) (getActivity().getIntent().getSerializableExtra(MemoryDetailActivity.EXTRA_MEMORY_ID)));
    setupNavigation();
    fillItemView(_selectedItem);
    return view;
}