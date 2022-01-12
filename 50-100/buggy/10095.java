private void select(int index) {
    assert index < 3;
    if ((suggestions[index]) == "") {
        processor.addWord(new java.util.ArrayList<com.shiweinan.ckeyboard.Point>());
        return ;
    }
    processor.addWord(screenPoints);
    screenPoints.clear();
    processor.showCorrectionHints(screenPoints);
    updateSuggestion();
}