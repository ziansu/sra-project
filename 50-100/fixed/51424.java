@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    setFont();
    mQuoteView.setText(generateQuote());
    mQuoteView.setTextSize(clunkyTextFormat());
    mAuthorView.setText(generateAuthor());
    mQuoteView.startAnimation(in);
    mAuthorView.startAnimation(in);
}