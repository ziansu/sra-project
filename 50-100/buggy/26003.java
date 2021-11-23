public static int getNext(int number, int order) {
    int temp = number;
    if (temp == (Odometer.getMax(order)))
        return Odometer.getMin(order);
    
    temp++;
    while (!(Odometer.isAscending(temp))) {
        temp = Odometer.getNext(temp);
    } 
    return temp;
}