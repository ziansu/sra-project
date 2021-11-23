@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    gridRecyclerAdapter.setOnItemClickListener(this);
    recyclerView.setAdapter(gridRecyclerAdapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.GridLayoutManager(getContext(), 2));
    presenter.getInformation(new java.lang.String[]{ java.lang.String.valueOf(currentPage) , java.lang.String.valueOf(15) });
}