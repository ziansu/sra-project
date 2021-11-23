@java.lang.Override
public int getItemViewType(int position) {
    if ((isReachedToLastPage()) && (position == ((getItemCount()) - 1))) {
        return VIEW_TYPE_FOOTER;
    }else
        if ((position > 1) && (position == ((getItemCount()) - 1))) {
            return VIEW_TYPE_LOADING;
        }
    
    return VIEW_TYPE_ITEM;
}