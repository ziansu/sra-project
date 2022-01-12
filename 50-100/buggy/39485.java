public static java.util.List<java.lang.Integer> getNDisjunctIntegers(java.util.Random random, int count, int max) {
    int randomNumber = random.nextInt(max);
    java.util.List<java.lang.Integer> temporaryList = new java.util.ArrayList<>();
    temporaryList.add(randomNumber);
    for (int counter = 0; counter < count; counter++) {
        java.util.List<java.lang.Integer> additionalNumbers = ptrman.mltoolset.math.DistinctUtility.getDisjuctNumbersTo(random, temporaryList, 1, max);
        temporaryList.addAll(additionalNumbers);
    }
    return temporaryList;
}