private void update() {
    int num = getNumber();
    if (num == (min)) {
        minusIv.setEnabled(false);
    }else
        if (num == (max)) {
            plusIv.setEnabled(false);
        }else {
            minusIv.setEnabled(true);
            plusIv.setEnabled(true);
        }
    
}