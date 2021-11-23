@java.lang.Override
protected boolean determine(double value) {
    if (value == ((testValue) * (multiplier))) {
        return true;
    }else {
        return false;
    }
}