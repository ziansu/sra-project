private int getActuallyPosition(int position) {
    int max = mAdapter.getCount();
    position += VISIBLE_VIEWS;
    while ((position < 0) || (position >= max)) {
        if (position < 0) {
            position += max;
        }else
            if (position >= max) {
                position -= max;
            }
        
    } 
    return position;
}