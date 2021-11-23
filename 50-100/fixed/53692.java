public int getImpact3(int level) {
    if (((this.impact3) == null) || (level < 0)) {
        return 0;
    }
    if (level >= (this.impact3.length)) {
        return this.impact3[this.impact3.length];
    }
    return this.impact3[level];
}