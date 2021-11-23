@java.lang.Override
public void onClick(android.view.View v) {
    if ((i) == (cards.size())) {
        i = 0;
    }
    mCardAnswerTextView.setVisibility(View.GONE);
    mCardQuestionTextView.setText(cards.get(i).getQuestion());
    mCardQuestionTextView.setVisibility(View.VISIBLE);
    mShowCardButton.setVisibility(View.VISIBLE);
    mNextCard.setVisibility(View.GONE);
}