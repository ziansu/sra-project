@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    final P presenter = getPresenter();
    if (presenter != null) {
        butterknife.ButterKnife.bind(presenter, view);
    }
    ready();
    if (presenter != null) {
        presenter.setView(this);
    }
}