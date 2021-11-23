@java.lang.Override
public int getItemCount() {
    if ((mOriginalAdapter) == null)
        return 0;
    
    return (mOriginalAdapter.getItemCount()) + (mItems.size());
}