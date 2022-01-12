private int getBillWorth(int itemDamage, int stackSize) {
    int cash = 0;
    switch (itemDamage) {
        case 0 :
            cash = 1;
            break;
        case 1 :
            cash = 5;
            break;
        case 2 :
            cash = 10;
            break;
        case 3 :
            cash = 20;
            break;
        case 4 :
            cash = 50;
            break;
        case 5 :
            cash = 100;
            break;
    }
    return cash * stackSize;
}