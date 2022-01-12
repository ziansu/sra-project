public static java.util.List findPrimeNumbers(java.util.List list, java.util.function.Predicate predicate) {
    java.util.List sortedNumbers = new java.util.ArrayList();
    list.stream().filter(( i) -> predicate.test(i)).forEach(( i) -> {
        sortedNumbers.add(i);
    });
    return sortedNumbers;
}