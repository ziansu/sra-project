public static java.util.List findPrimeNumbers(java.util.List<java.lang.Integer> list, java.util.function.Predicate<java.lang.Integer> predicate) {
    java.util.List<java.lang.Integer> sortedNumbers = new java.util.ArrayList<>();
    list.stream().filter(( i) -> predicate.test(i)).forEach(( i) -> {
        sortedNumbers.add(i);
    });
    return sortedNumbers;
}