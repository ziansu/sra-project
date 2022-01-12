@java.lang.Override
public void onNext(com.mavpokit.rxretrofitmvp.Model.Pojo.ListQuestion questionList) {
    if (isListNotEmpty(questionList)) {
        listQuestion = questionList;
        view.showQuestionList(questionList);
        view.hideSpinner();
    }else {
        view.showNothing();
        view.hideSpinner();
    }
}