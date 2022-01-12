public boolean isEquivalentTo(Matrix B) {
    if (!(this.isEqualTo(B))) {
        return false;
    }
    for (int i = 0; i < (this.rows); i++) {
        for (int j = 0; j < (this.columns); j++) {
            if ((this.data[i][j]) != (B.data[i][j])) {
                return false;
            }
        }
    }
    return true;
}