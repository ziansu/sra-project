public void setRed(int red) {
    if (red < 0) {
        red = 0;
    }else
        if (red > 255) {
            red = 255;
        }else {
            this.red = red;
        }
    
}