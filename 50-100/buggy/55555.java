public static void checkFibo(long input) {
    if ((input == 0) || (input == 1))
        java.lang.System.out.println("IsFibo");
    
    long currentFibo = 0;
    long previousFibo = 1;
    long newFibo = 0;
    while (true) {
        newFibo = algorithms.IsFibo.nextFibo(previousFibo, currentFibo);
        if (newFibo > input) {
            java.lang.System.out.println("IsNotFibo");
            break;
        }
        if (input == newFibo) {
            java.lang.System.out.println("IsFibo");
            break;
        }
        currentFibo = previousFibo;
        previousFibo = newFibo;
    } 
}