@java.lang.Override
public int getCount() {
    int count = super.getCount();
    if (null != (hint))
        count -= 1;
    
    return count;
}