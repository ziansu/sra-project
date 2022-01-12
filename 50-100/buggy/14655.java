public void advance(int position, java.lang.Integer[] counters, java.lang.Integer[] boundaries) {
    if ((position < (counters.length)) && (position < (boundaries.length))) {
        java.lang.Integer counter = counters[position];
        if ((counter.compareTo(boundaries[position])) < 0)
            counters[position] = counter + 1;
        else {
            counters[position] = 0;
            advance((position + 1), counters, boundaries);
        }
    }
}