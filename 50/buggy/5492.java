@java.lang.Override
protected io.dflabs.sample.views.adapters.FruitAdapter.FruitViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType, android.support.v7.widget.RecyclerView recyclerView) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fruit, parent, false);
    return new io.dflabs.sample.views.adapters.FruitAdapter.FruitViewHolder(v);
}