public java.util.List<java.lang.Integer> generatePrimes(int number) {
    for (int i = 2; i <= number; i++) {
        while ((number % i) == 0) {
            primeList.add(i);
            number /= i;
        } 
    }
    java.lang.System.out.println(primeList);
    return primeList;
}