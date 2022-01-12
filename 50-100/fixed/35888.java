@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ru.annin.fateyn.presentation.ui.viewholder.MainViewHolder viewHolder = new ru.annin.fateyn.presentation.ui.viewholder.MainViewHolder(findViewById(R.id.main));
    presenter = new ru.annin.fateyn.presentation.presenter.MainPresenter();
    presenter.setViewHolder(viewHolder);
    presenter.onInitialization();
}