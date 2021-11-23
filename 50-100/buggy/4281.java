public void sortListOrSwapQuotesInDocument(final java.lang.String delimiterSplitPattern, final java.lang.String delimiterGlue, final boolean isUp) {
    if (!(containsQuotes)) {
        document.replaceString(offsetStart, offsetEnd, com.kstenschke.shifter.models.shiftableTypes.SeparatedList.sortSeparatedList(selectedText, delimiterSplitPattern, delimiterGlue, (!isUp)));
        return ;
    }
    java.util.List<java.lang.String> shiftOptions = new java.util.ArrayList<java.lang.String>();
    shiftOptions.add(StaticTexts.SHIFT_OPTION_LIST_ITEMS_SORT);
    shiftOptions.add(StaticTexts.SHIFT_OPTION_QUOTES_SWAP);
    shiftSelectionByPopupInDocument(shiftOptions, false, null, delimiterSplitPattern, delimiterGlue);
}