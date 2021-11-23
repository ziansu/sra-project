public static java.lang.String getShifted(java.lang.String word, java.lang.String delimiterSplitPattern, java.lang.String delimiterGlue, boolean shiftUp) {
    return com.kstenschke.shifter.models.shiftableTypes.SeparatedList.sortSeparatedList(word, delimiterSplitPattern, delimiterGlue, (!shiftUp));
}