public static void main(java.lang.String[] args) {
    double inches;
    double meters;
    counter = 0;
    for (inches = 1; inches <= 144; inches++)
        meters = inches / 39.37;
    
    java.lang.System.out.println((((inches + "inches is ") + meters) + "meters."));
    (counter)++;
    if ((counter) == 12) {
        java.lang.System.out.println();
        counter = 0;
    }
}