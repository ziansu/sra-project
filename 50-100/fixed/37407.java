private static boolean tryLeft(int i) {
    boolean isPossible = true;
    while ((i > 10) && isPossible) {
        int length = (java.lang.Integer.toString(i).length()) - 1;
        int div = ((int) (java.lang.Math.pow(10, length)));
        i %= div;
        div /= 10;
        isPossible = ProjectEuler.CommonMethods.checkIfPrime(i);
    } 
    return isPossible;
}