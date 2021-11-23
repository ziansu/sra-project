public static int getAmtChipsOnField(int chipPosition) {
    int amt = 0;
    int i = 0;
    while (((GameField.field[chipPosition][i]) < 3) && (i < 3)) {
        i++;
        amt++;
        if (i == 2)
            break;
        
    } 
    return amt;
}