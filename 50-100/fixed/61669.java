@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    int temp;
    temp = (firstPage) + (change);
    if ((temp + (LEN)) >= (len)) {
        firstPage = (((len) - (LEN)) > 0) ? (len) - (LEN) : 0;
    }else
        if (temp < 0) {
            firstPage = 0;
        }else {
            firstPage = temp;
        }
    
    setCategory(firstPage);
}