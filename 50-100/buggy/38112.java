@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int button) {
    if (button == (android.content.DialogInterface.BUTTON_POSITIVE)) {
        java.lang.String selection = ((QuizData.TABLE_QUIZ) + "=") + (QuizData.TABLE_QUIZ);
        getContentResolver().delete(QuizProvider.CONTENT_URI, selection, null);
        restartLoader();
        android.widget.Toast.makeText(this, "Deleted All Quizs", Toast.LENGTH_SHORT).show();
    }
}