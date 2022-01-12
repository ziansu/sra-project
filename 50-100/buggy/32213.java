private void showNextQuestion() {
    if (hasInternet()) {
        if (!(mIsChoiceOneAnswer)) {
            com.driver.go.utils.ToastManager.showSelectOneAnswerMsg();
            return ;
        }
        if ((++(mCurrentIndex)) == (mQuestions.size())) {
            (mCurrentIndex)--;
            com.driver.go.utils.ToastManager.showCompleteWrongQuestionMsg();
            return ;
        }
        initUI();
        mCurrentQuestionItem = mQuestions.get(mCurrentIndex);
        updateUI(mCurrentQuestionItem);
        mIsChoiceOneAnswer = false;
        mIsExcluded = false;
    }else {
        com.driver.go.utils.ToastManager.showNoNetworkMsg();
    }
}