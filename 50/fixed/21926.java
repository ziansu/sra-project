private int highCard() {
    for (int i = 12; i >= 0; i--) {
        if ((numberOf(i)) > 0)
            return i;
        
    }
    return -1;
}