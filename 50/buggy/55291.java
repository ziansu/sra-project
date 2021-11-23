@java.lang.Override
public int getCount() {
    int count = (super.getCount()) - 1;
    if ((null != (hint)) && (viewed))
        count -= 1;
    
    return count;
}