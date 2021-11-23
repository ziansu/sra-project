@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, kevts.washington.edu.quizdroid.QuestionPage.class);
    startActivityForResult(intent, 1);
}