public int getImpact3(int level) {
    if ((((this.impact3) == null) || (level < 0)) || (level >= (this.impact3.length))) {
        return 0;
    }
    return this.impact3[level];
}