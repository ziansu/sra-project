public void addCB(QuestionCB q) {
    questionsCB.add(q);
    order.add(3);
    (size)++;
    writeToFile(((quizName) + ".txt"), toString(), true);
}