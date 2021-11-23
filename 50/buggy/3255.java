public int toRealPosition(int position) {
    int realPosition = (position - 1) % (count);
    if (realPosition < 0)
        realPosition += count;
    
    return realPosition;
}