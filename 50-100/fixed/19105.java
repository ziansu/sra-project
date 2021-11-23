@java.lang.Override
public void onClick(android.view.View view) {
    if (textInputLayout.isErrorEnabled())
        return ;
    
    dismiss();
    android.content.Intent intent = new android.content.Intent(parent, hk.ust.cse.hunkim.questionroom.QuestionActivity.class);
    intent.putExtra(QuestionActivity.ROOM_NAME, textInputLayout.getEditText().getText().toString());
    parent.startActivity(intent);
}