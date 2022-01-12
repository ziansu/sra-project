@java.lang.Override
protected void logic() {
    rotate += valueFlag;
    if ((rotate) >= 60.0F) {
        valueFlag = (-1) * (speed);
    }else
        if ((rotate) <= (-60)) {
            valueFlag = speed;
        }
    
}