private void textChanged() {
    switch (mTypingState) {
        case Start :
            if ((mText.length()) <= 0) {
                return ;
            }
            setText(getHtmlText(), BufferType.SPANNABLE);
            goToBeginningOfParkedText();
            mTypingState = com.goka.parkedtextview.ParkedTextView.TypingState.Typed;
            break;
        case Typed :
            if (mText.equals(mParkedText)) {
                mTypingState = com.goka.parkedtextview.ParkedTextView.TypingState.Start;
                setText(getHtmlText(), BufferType.SPANNABLE);
                return ;
            }
            setText(getHtmlText(), BufferType.SPANNABLE);
            goToBeginningOfParkedText();
        default :
            break;
    }
}