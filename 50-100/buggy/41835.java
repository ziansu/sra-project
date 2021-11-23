@java.lang.Override
protected void initPresenter() {
    super.initPresenter();
    io.github.erikcaffrey.ayudamexico.help.model.HelpClient helpClient = new io.github.erikcaffrey.ayudamexico.help.model.HelpClient();
    io.github.erikcaffrey.ayudamexico.help.model.HelpInteractor helpInteractor = new io.github.erikcaffrey.ayudamexico.help.model.HelpInteractor(helpClient);
    helpPresenter = new io.github.erikcaffrey.ayudamexico.help.presenter.HelpPresenter(helpInteractor);
    helpPresenter.setUi(this);
    helpPresenter.loadHelpList();
    recycler_help = ((android.support.v7.widget.RecyclerView) (this.getView().findViewById(R.id.recycler_help)));
    initializeAdapter();
    initializeRecyclerView();
}