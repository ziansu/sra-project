public void mouseUpdate(int mx, int my, boolean pressed) {
    if (pressed == false) {
        this.destroy();
    }else
        if (this.contains(mx, my)) {
            if ((this.fixed) == true) {
                this.bind(mx, this.fixed_y);
            }else {
                this.bind(mx, my);
            }
        }
    
}