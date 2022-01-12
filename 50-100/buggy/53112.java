public static void main(java.lang.String[] args) {
    int maxNumber = 10000;
    java.lang.System.out.println(("Is 111 prime? : " + (Factors.isNotPrime(111))));
    for (int i = 10; i < maxNumber; i++) {
        if ((Factors.isPalindrome(i)) && (Factors.isNotPrime(i))) {
            java.lang.System.out.println(((i + " ") + (Factors.getPalindromicFactors(i))));
        }
    }
}