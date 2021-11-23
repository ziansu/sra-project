@java.lang.Override
public int getItemCount() {
    int count = super.getItemCount();
    if ((count >= 0) && (isReachedToLastItem())) {
        count++;
    }else
        if (isReachedToLastPage()) {
            count++;
        }
    
    return count;
}