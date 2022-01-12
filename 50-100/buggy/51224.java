@java.lang.Override
public void update() {
    if (((x) + (heroDX)) < 0) {
        x = 0;
    }else
        if (((x) + (heroDX)) > (800 - (w))) {
            x = 792 - (w);
        }else
            x += heroDX;
        
    
    if (((y) + (heroDY)) < 550)
        y += heroDY;
    
}