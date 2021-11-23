public int AskQuestion(java.util.ArrayList<java.lang.String> Question) {
    java.lang.Object[] options = new java.lang.Object[]{ Question.get(2) , Question.get(3) , Question.get(1) , Question.get(4) };
    int answer = javax.swing.JOptionPane.showOptionDialog(null, Question.get(0), "Quiz", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
    return answer;
}