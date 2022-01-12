public java.lang.String get(java.lang.String imp, double chance, java.lang.String end) throws java.io.FileNotFoundException {
    if ((rand.nextFloat()) < chance) {
        imp = (imp + (nthString(random(rand, 0, wordCount(list)), list))) + end;
        return imp;
    }
    return "";
}