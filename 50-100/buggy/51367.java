public static int getPrevious(int number, int order) {
    int temp = number;
    if (temp == (Odometer.getMin(order)))
        return Odometer.getMax(order);
    
    temp--;
    while (!(Odometer.isAscending(temp))) {
        temp = Odometer.getPrevious(temp);
    } 
    return temp;
}