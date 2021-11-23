public void setR(int r) {
    if (r > 255)
        r = 255;
    
    if (r < 0)
        r = 0;
    
    R = com.veromeev.bsuir.dip.l1.util.Conv.itob(r);
}