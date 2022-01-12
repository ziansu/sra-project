public void normalize() {
    for (int i = 0; i < (iSize); i++) {
        double sum = sum(i);
        if (sum != 0) {
            for (int j = 0; j < (jSize); j++) {
                this.set(i, j, ((this.get(i, j)) / sum));
            }
        }
    }
}