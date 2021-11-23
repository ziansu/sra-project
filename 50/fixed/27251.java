@java.lang.Override
public void move(final long distance, final int d) {
    if (distance > 0)
        add(d);
    else
        if (distance < 0)
            remove(d);
        
    
}