public void power() {
    if ((power) == false) {
        power = true;
    }else {
        reset();
        power = false;
        printerPower = false;
    }
}