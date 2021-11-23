@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((view) == null) {
        view = inflater.inflate(R.layout.fragment_article_list, container, false);
    }
    initView();
    allarticlePresenter = new com.otb.designerassist.mvp.presenter.impl.AllarticlePresenter(this);
    qryMeijus();
    return view;
}