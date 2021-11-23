@butterknife.OnClick(value = { R.id.background1 , R.id.background2 , R.id.background3 , R.id.background4 })
public void pickAnswer(android.view.View pickedView) {
    for (int i = 0; i < (backgroundViews.size()); i++) {
        android.view.View view = backgroundViews.get(i);
        view.setSelected(view.equals(pickedView));
        if (view.equals(pickedView)) {
            mCurrentAnswer = mAnswers[i];
        }
    }
    submitButton.setEnabled(true);
}