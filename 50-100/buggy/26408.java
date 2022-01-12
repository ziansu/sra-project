@java.lang.Override
public void onChanged(dev.blunch.blunch.activity.EventType type) {
    dev.blunch.blunch.domain.CollaborativeMenu menu = service.getAll().get(0);
    if (menu != null) {
        toolbar.setTitle(("Answers for " + (menu.getName())));
        idMenu = menu.getId();
        android.view.View recyclerView = findViewById(R.id.proposal_list);
        assert recyclerView != null;
        setupRecyclerView(((android.support.v7.widget.RecyclerView) (recyclerView)));
    }
}