@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(parent.getContext());
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder;
    if (viewType == (com.emcsthai.mworkshop.Controller.Adapter.CarListInoutDetailAdapter.VIEW_TYPE_ITEM)) {
        android.view.View v = inflater.inflate(R.layout.adapter_car_repair_info, parent, false);
        viewHolder = new com.emcsthai.mworkshop.Controller.Adapter.CarListInoutDetailAdapter.CarRepairInfoViewHolder(v);
    }else {
        android.view.View v = inflater.inflate(R.layout.adapter_car_repair_load_more, parent, false);
        viewHolder = new com.emcsthai.mworkshop.Controller.Adapter.CarListInoutDetailAdapter.LoadModeViewHolder(v);
    }
    return viewHolder;
}