public void submitAnswers(android.view.View view) {
    if (checkForm()) {
        totScore = calculateScore();
        java.lang.String msg = ("Congratulations! your score is " + (totScore)) + "/5";
        if ((totScore) < 5) {
            msg += "\n Keep trying until you make it perfect ;)";
        }
        createToast(msg);
        return ;
    }
    createToast("Please answer every question before submitting");
    startActivity();
}