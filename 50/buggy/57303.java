public boolean digitsAllEven() {
    for (long digit : digits) {
        if ((digit & 1) != 0)
            return false;
        
    }
    return true;
}