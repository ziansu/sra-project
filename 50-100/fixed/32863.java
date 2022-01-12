public java.lang.String getResultAsString(java.lang.String timeDuration) {
    int total = this.userSelection.length;
    int correct = 0;
    for (int i = 0; i < total; i++) {
        if ((userSelection[i]) == (test.getQuestions().get(i).getCorrectAnswer())) {
            correct++;
        }
    }
    return (java.lang.String.format(this.context.getString(R.string.dialog_result_content), correct, total)) + timeDuration;
}