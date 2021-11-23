@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int i) {
    if (i == (TYPE_HEADER)) {
        android.view.View view = inflater.inflate(R.layout.adapter_activity_plan_header, parent, false);
        my.com.taruc.fitnesscompanion.Adapter.ActivityPlanAdapter.HeaderViewHolder holder = new my.com.taruc.fitnesscompanion.Adapter.ActivityPlanAdapter.HeaderViewHolder(view);
        return holder;
    }else {
        android.view.View view = inflater.inflate(R.layout.adapter_activity_plan_item, parent, false);
        my.com.taruc.fitnesscompanion.Adapter.ActivityPlanAdapter.ItemViewHolder holder = new my.com.taruc.fitnesscompanion.Adapter.ActivityPlanAdapter.ItemViewHolder(view);
        holder.itemView.setOnClickListener(new my.com.taruc.fitnesscompanion.Adapter.ActivityPlanAdapter.PlanOnClickListener(i, index));
        return holder;
    }
}