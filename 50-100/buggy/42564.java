@java.lang.Override
public void onViewCreated(be.ugent.zeus.hydra.fragments.sko.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.support.v7.widget.RecyclerView recyclerView = be.ugent.zeus.hydra.utils.ViewUtils.$(view, R.id.recycler_view);
    refreshLayout = be.ugent.zeus.hydra.utils.ViewUtils.$(view, R.id.refresh_layout);
    refreshLayout.setOnRefreshListener(this);
    joiner = new su.j2e.rvjoiner.RvJoiner();
    recyclerView.setAdapter(joiner.getAdapter());
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
}