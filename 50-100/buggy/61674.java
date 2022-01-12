@java.lang.Override
public void onClick(android.view.View v) {
    if ((adapter.getSectionItems(getHeader()).size()) == 1) {
        holder.textViewKey.setText(null);
        holder.textViewValue.setText(null);
        return ;
    }
    int position = holder.getAdapterPosition();
    if ((position < 0) || (position >= (adapter.getItemCount())))
        return ;
    
    holder.textViewKey.clearFocus();
    holder.textViewValue.clearFocus();
    adapter.removeItem(position);
}