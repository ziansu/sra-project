public Checker findChecker(Checker checker) {
    for (Checker c : checkerslist) {
        if (checker.equals(c)) {
            return c;
        }
    }
    return null;
}