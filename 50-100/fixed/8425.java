void factr() {
    if ((tail.data) == null)
        return ;
    
    int tmp = 1;
    for (int i = 1; i <= ((int) ((double) (tail.data))); i++) {
        tmp *= i;
    }
    tail.data = ((double) (tmp));
}