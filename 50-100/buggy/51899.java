@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    answer.removeTextChangedListener(wtAns);
    java.lang.String ans;
    ans = answer.getText().toString();
    if (((ans.length()) == 0) || (!(isGameStarted))) {
        answer.addTextChangedListener(wtAns);
        return ;
    }
    Judge();
    if (isGameStarted)
        answer.addTextChangedListener(wtAns);
    
}