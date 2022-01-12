public boolean wasSuccessful() {
    return (((response.length) >= 2) && ((response[((response.length) - 2)]) == 144)) && ((response[((response.length) - 1)]) == 0);
}