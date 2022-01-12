public void showResult(int correctAnswers, int totalCards) {
    if (com.blstream.studybox.activities.BaseExamActivity.isInExam) {
        com.blstream.studybox.exam.ResultDialogFragment resultDialog = com.blstream.studybox.exam.ResultDialogFragment.newInstance(correctAnswers, totalCards);
        resultDialog.show(getSupportFragmentManager(), com.blstream.studybox.activities.BaseExamActivity.TAG_RESULT);
    }else {
        com.blstream.studybox.components.Dialogs dialog = new com.blstream.studybox.components.Dialogs(this);
        dialog.studyEndDialogInit();
        dialog.show();
    }
}