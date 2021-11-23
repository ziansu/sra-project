public static <T> T anotherOf(java.util.List<T> l, T... alreadyChosen, java.util.Random rng) {
    T elem;
    while ((elem == null) || (java.util.Arrays.asList(alreadyChosen).contains(elem))) {
        elem = ListUtil.oneOf(l, rng);
    } 
    return elem;
}