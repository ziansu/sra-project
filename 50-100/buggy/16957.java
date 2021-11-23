private void updateSuggestions() {
    org.distantshoresmedia.keyboard.TKKeyboardView inputView = mKeyboardSwitcher.getInputView();
    ((org.distantshoresmedia.keyboard.TKKeyboard) (inputView.getKeyboard())).setPreferredLetters(null);
    if (((mSuggest) == null) || (!(isPredictionOn()))) {
        return ;
    }
    if (!(mPredicting)) {
        setNextSuggestions();
        return ;
    }
    showSuggestions(mWord);
}