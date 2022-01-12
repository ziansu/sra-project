@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (editable != null) {
        answerList.get(getPosition()).setNumAns(java.lang.String.valueOf(editable));
        saveAnswer.onAnswerSave(answerList.get(getPosition()));
    }
}