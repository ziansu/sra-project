@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (position == 0) {
    }else
        if (position == ((users.size()) + 1)) {
            ((com.harlan.jxust.ui.adapter.viewholder.BaseViewHolder) (holder)).bindData(users.size());
        }else {
            ((com.harlan.jxust.ui.adapter.viewholder.BaseViewHolder) (holder)).bindData(users.get((position - 1)));
        }
    
}