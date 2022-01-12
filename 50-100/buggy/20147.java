@java.lang.Override
public void onBindViewHolder(com.github.yasevich.endlessrecyclerview.ViewHolder holder, int position) {
    if ((position == 0) && (!(refreshingTop))) {
        adapter.onBindViewHolder(holder, position);
    }
    if ((position > 0) && (position < (adapter.getItemCount()))) {
        adapter.onBindViewHolder(holder, position);
    }
}