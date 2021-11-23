@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int button) {
    if (button == (android.content.DialogInterface.BUTTON_POSITIVE)) {
        getContentResolver().delete(QuizProvider.CONTENT_URI, null, null);
        restartLoader();
        android.widget.Toast.makeText(this, "Deleted All Quizs", Toast.LENGTH_SHORT).show();
    }
}