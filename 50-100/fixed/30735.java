public void Normalize180() {
    angle -= (java.lang.Math.floor(((angle) / 360.0F))) * 360.0F;
    if ((angle) > 180.0F) {
        angle -= 360.0F;
    }else
        if ((angle) < (-180.0F)) {
            angle += 360.0F;
        }
    
    int a = 0;
}