@java.lang.Override
public int getItemPosition(java.lang.Object object) {
    int index = fragments.indexOf(object);
    if (index == (-1))
        return POSITION_NONE;
    else
        return index;
    
}