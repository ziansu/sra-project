@java.lang.Override
public void onClick(android.view.View v) {
    final java.lang.String hiragana = hiraganaTextInput.getText().toString();
    if (hiragana.equals(hiraganaAnswers.get(count))) {
        hiraganaTextInput.setText("");
        hiraganaWords.remove(count);
        hiraganaAnswers.remove(count);
        randLimit -= 1;
        count = rand.nextInt(randLimit);
        hiraganaText.setText(hiraganaWords.get(count));
    }
}