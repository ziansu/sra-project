public void setStatus(double speed) {
    if (speed > 1.4) {
        this.status = 2;
        textStatus.setText("跑步");
    }else
        if (speed < 1.0E-6) {
            this.status = 0;
            textStatus.setText("静止");
        }else {
            this.status = 1;
            textStatus.setText("步行");
        }
    
}