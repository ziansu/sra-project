public double gradeQuiz(java.util.ArrayList<java.lang.Integer> answers) {
    double sum = 0;
    for (int i = 0; i < (questions.size()); i++) {
        int answer = answers.get(i);
        if (questions.get(i).isCorrect(answer)) {
            sum += 1;
        }
    }
    return (sum / (questions.size())) * 100;
}