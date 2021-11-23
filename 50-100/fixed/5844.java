public void minimizeCovers(espresso.boolFunction.Cover[] covers, java.util.Set<java.lang.Integer> coverChoices) {
    if ((coverChoices.size()) == 0) {
        minimizeCovers(covers);
        return ;
    }
    for (int i = 0; i < (covers.length); i++) {
        if (coverChoices.contains(i)) {
            covers[i] = minimizer.minimize(covers[i]);
        }
    }
}