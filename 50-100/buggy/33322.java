@java.lang.Override
public void onClick(android.view.View v) {
    ((com.group6boun451.learner.Activity.HomePage) (v.getContext())).openDetails(v.findViewById(R.id.card_view), topic);
    if ((topic.getQuestions().size()) == 0) {
        isThereQuiz = false;
    }else {
        isThereQuiz = true;
    }
}