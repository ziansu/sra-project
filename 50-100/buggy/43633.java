@java.lang.Override
public long getItemId(int position) {
    int originalPos = getOriginalPosition(position);
    if ((originalPos != (-1)) && ((mOriginalAdapter.getItemCount()) > originalPos))
        return mOriginalAdapter.getItemId(originalPos);
    
    return super.getItemId(position);
}