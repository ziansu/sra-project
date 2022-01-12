@java.lang.Override
public void onClick(android.view.View v) {
    curCharacter = rand.nextInt(3);
    updateUI();
    mNextButton.setText(R.string.next_button);
    mNextButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if ((curHint) < (mCharacterBank[curCharacter].getNumHints())) {
                curHint = (curHint) + 1;
            }
            updateUI();
        }
    });
}