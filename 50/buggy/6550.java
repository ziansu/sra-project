@butterknife.OnClick(value = R.id.sign_up_tv)
public void signUp() {
    android.content.Intent intent = new android.content.Intent(this, com.geekhub.choosehelper.screens.activities.SignUpActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NO_ANIMATION) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
    finish();
}