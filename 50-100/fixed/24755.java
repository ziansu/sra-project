private boolean sampleDiffersFromReference(int position, char mostDominantBase) {
    int index = position - 1;
    if (((index < 0) || (index >= (NaiveVariantCaller.NaiveVariantCaller_Reducer.RCRS.length()))) || ((NaiveVariantCaller.NaiveVariantCaller_Reducer.RCRS.charAt(index)) == mostDominantBase)) {
        return false;
    }
    return true;
}