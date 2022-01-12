public static java.lang.Object anotherOf(java.util.List l, java.lang.Object alreadyChosen, java.util.Random rng) {
    java.lang.Object elem = null;
    while ((elem == null) || (java.util.Arrays.asList(alreadyChosen).contains(elem))) {
        elem = ListUtil.oneOf(l, rng);
    } 
    return elem;
}