@java.lang.Override
public void show() {
    boolean canPaste = (mTextView.canPaste()) && ((mSelectionActionMode) == null);
    boolean canSuggest = (mTextView.isSuggestionsEnabled()) && (isCursorInsideSuggestionSpan());
    mPasteTextView.setVisibility((canPaste ? android.view.View.VISIBLE : android.view.View.GONE));
    mReplaceTextView.setVisibility((canSuggest ? android.view.View.VISIBLE : android.view.View.GONE));
    if ((!canPaste) && (!canSuggest))
        return ;
    
    super.show();
}