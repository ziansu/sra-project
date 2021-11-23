@java.lang.Override
public int getItemCount() {
    if ((headerView) != null)
        return (items.size()) + 1;
    else
        return items.size();
    
}