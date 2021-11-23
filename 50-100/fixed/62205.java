@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_body_content, null);
    butterknife.ButterKnife.bind(this, view);
    presenter = new com.andrusenko.advertismentupdater.Presenter.PresenterMain(getContext());
    setListView();
    return view;
}