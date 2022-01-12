public boolean makeSale() {
    if (((deposit) >= (price)) && ((stock) >= 1)) {
        (stock)--;
        if ((deposit) > (price)) {
            change = (deposit) - (price);
        }
        deposit = 0;
        return true;
    }
    return false;
}