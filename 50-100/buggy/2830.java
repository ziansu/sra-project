private static java.lang.Integer[] randomInt(int numOfRand, int upperbound) {
    java.util.Set<java.lang.Integer> set = new java.util.HashSet<java.lang.Integer>();
    while ((set.size()) < numOfRand) {
        set.add((((int) ((java.lang.Math.random()) * upperbound)) + 1));
    } 
    java.lang.Integer[] integerArray = set.toArray(new java.lang.Integer[set.size()]);
    return integerArray;
}