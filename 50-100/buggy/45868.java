@java.lang.Override
public void onClick(android.view.View v) {
    if ((i) == (cards.size())) {
        i = 0;
    }
    mCardQuestionTextView.setVisibility(View.VISIBLE);
    mCardAnswerTextView.setVisibility(View.GONE);
    mCardQuestionTextView.setText(cards.get(i).getQuestion());
    mShowCardButton.setVisibility(View.VISIBLE);
    mNextCard.setVisibility(View.GONE);
}