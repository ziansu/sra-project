@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    ans.setNumAns(java.lang.String.valueOf(editable));
    answer.onAnswerSave(ans);
}