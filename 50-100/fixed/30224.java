public void CHNG_U() {
    if ((MDR) == 0) {
        SI = 2;
        return ;
    }
    MDR = 0;
    IC[0] = 0;
    IC[1] = 0;
    SP[0] = 0;
    SP[1] = 13;
}