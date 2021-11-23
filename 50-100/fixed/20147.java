@java.lang.Override
public void onBindViewHolder(com.github.yasevich.endlessrecyclerview.ViewHolder holder, int position) {
    if (refreshingTop) {
        if ((position != 0) && ((position - 1) < (adapter.getItemCount()))) {
            adapter.onBindViewHolder(holder, (position - 1));
        }
    }else {
        if (position < (adapter.getItemCount())) {
            adapter.onBindViewHolder(holder, position);
        }
    }
}