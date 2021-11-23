private boolean sampleDiffersFromReference(int position, char mostDominantBase) {
    if ((position >= (NaiveVariantCaller.NaiveVariantCaller_Reducer.RCRS.length())) || ((NaiveVariantCaller.NaiveVariantCaller_Reducer.RCRS.charAt((position - 1))) == mostDominantBase)) {
        return false;
    }
    return true;
}