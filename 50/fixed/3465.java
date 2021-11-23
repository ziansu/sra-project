public boolean power() {
    if ((power) == false) {
        power = true;
        return true;
    }else {
        reset();
        power = false;
        printerPower = false;
        return false;
    }
}