@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (position == (users.size())) {
        ((com.harlan.jxust.ui.adapter.viewholder.BaseViewHolder) (holder)).bindData(users.size());
    }else {
        ((com.harlan.jxust.ui.adapter.viewholder.BaseViewHolder) (holder)).bindData(users.get(position));
    }
}