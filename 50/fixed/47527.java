@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, rray.me.androidresume.EducationEditActivity.class);
    startActivityForResult(intent, rray.me.androidresume.MainActivity.REQ_CODE_EDUCATION_EDIT);
}