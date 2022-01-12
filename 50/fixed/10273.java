@java.lang.Override
public void setHasStableIds(boolean hasStableIds) {
    super.setHasStableIds(hasStableIds);
    if ((mOriginalAdapter) != null)
        mOriginalAdapter.setHasStableIds(hasStableIds);
    
}