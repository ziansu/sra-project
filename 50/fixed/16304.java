public boolean isSameSite(java.lang.String chr, int pos) {
    if ((this.chr.equalsIgnoreCase(chr)) && ((this.pos) == pos)) {
        return true;
    }
    return false;
}