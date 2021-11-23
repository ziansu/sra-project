public static int sumMultiples(int multiple, int max) {
    int sum = 0;
    int current = multiple;
    while (current <= max) {
        sum = sum + current;
        current = current + multiple;
    } 
    return sum;
}