private double getQValue(ab.demo.qlearning.ProblemState s, int action) {
    return qValuesDAO.getQValue(s.toString(), action);
}