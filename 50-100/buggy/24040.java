public boolean isSorted(int n) {
    if (n < 0) {
        n = n * (-1);
    }
    if ((n / 10) == 0) {
        return true;
    }else {
        if ((n % 10) < ((n / 10) % 10)) {
            return false;
        }else {
            return true;
        }
    }
}