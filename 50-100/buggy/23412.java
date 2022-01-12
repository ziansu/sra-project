@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    if ((mView) == null) {
        mView = inflater.inflate(R.layout.fragment_schedule_builder_summary, container, false);
        butterknife.ButterKnife.bind(this, mView);
        initiate(savedInstanceState);
    }
    setHasOptionsMenu(true);
    return mView;
}