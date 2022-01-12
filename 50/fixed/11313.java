@java.lang.Override
public void setPosition(final int position, final int d) {
    if (position > 0)
        add(d);
    else
        remove(d);
    
}