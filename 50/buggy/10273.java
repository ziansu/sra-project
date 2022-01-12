@java.lang.Override
public void setHasStableIds(boolean hasStableIds) {
    super.setHasStableIds(hasStableIds);
    mOriginalAdapter.setHasStableIds(hasStableIds);
}