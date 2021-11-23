@java.lang.Override
public int getItemCount() {
    int count = super.getItemCount();
    if ((count >= 0) && (isReachedToLastItem())) {
        count++;
    }else
        if ((count >= 0) && (isReachedToLastPage())) {
            count++;
        }
    
    return count;
}