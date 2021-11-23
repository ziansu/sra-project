public void setOrientation(double rad) {
    if (rad > (java.lang.Math.PI)) {
        setOrientation((rad - (2 * (java.lang.Math.PI))));
    }else
        if (rad < (-(java.lang.Math.PI))) {
            setOrientation((rad + (2 * (java.lang.Math.PI))));
        }else {
            this.orientation = rad;
        }
    
}