@java.lang.Override
public void onClick(android.view.View v) {
    ((com.group6boun451.learner.Activity.HomePage) (v.getContext())).openDetails(v.findViewById(R.id.card_view), topic);
    isThereQuiz = (topic.getQuestions().size()) != 0;
}