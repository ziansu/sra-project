public void mouseUpdate(int mx, int my, boolean pressed) {
    if (pressed == false) {
        this.destroy();
    }else
        if (this.contains(mx, my)) {
            if (!(this.fixed)) {
                this.bind(mx, my);
            }else {
                this.bind(mx, this.fixed_y);
            }
        }
    
}