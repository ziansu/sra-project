private void wrongAnswer() {
    if ((answer) != (lesson.getItems().get(((rounds) - 1)).getID())) {
        sFeedback = eval.getImmediateFeedback(lesson.getItems().get(((rounds) - 1)).getID(), "", lessonNumber);
    }else {
        sFeedback = "Sorry, that is the wrong position.";
    }
    transition = true;
    changeToError(sAnswer);
}