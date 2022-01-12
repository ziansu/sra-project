public void setErrData(int[] err) {
    for (int i = 0; i < (err.length); i++) {
        if (1 == (err[i])) {
            inthis.set(i);
        }
    }
}