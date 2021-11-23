private void update() {
    int num = getNumber();
    if (num == (min)) {
        minusIv.setEnabled(false);
        plusIv.setEnabled(true);
    }else
        if (num == (max)) {
            minusIv.setEnabled(true);
            plusIv.setEnabled(false);
        }else {
            minusIv.setEnabled(true);
            plusIv.setEnabled(true);
        }
    
}