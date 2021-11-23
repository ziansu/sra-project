@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.amittpad.info.introductionslider.SignUpActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)));
    startActivity(intent);
}