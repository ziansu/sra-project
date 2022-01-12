public boolean[] getScore() {
    boolean[] score = new boolean[this.bugs.size()];
    for (int i = 0; i < (this.bugs.size()); i++) {
        for (java.util.Vector mark : this.marks) {
            if (markConfig.isEncircled(bugs.get(i), mark)) {
                score[i] = true;
                break;
            }
        }
    }
    return score;
}