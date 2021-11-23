public int findR(java.lang.String letter) {
    for (r $missing$ : this) {
        for (c $missing$ : r) {
            if (letter == (this[r][c])) {
                return r;
            }
        }
    }
}