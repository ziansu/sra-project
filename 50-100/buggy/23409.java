public boolean simulateLost(int port, int value) {
    int valueIndex = 2;
    if ((userChoice[valueIndex]) <= 0) {
        userChoice[0] = 0;
    }else {
        userChoice[valueIndex] = (userChoice[valueIndex]) - 1;
    }
    java.lang.System.out.println("!");
    java.lang.System.out.println("<simulateLost>");
    java.lang.System.out.println("!");
    return true;
}