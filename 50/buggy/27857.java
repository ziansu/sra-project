private double getQValue(ab.demo.qlearning.ProblemState s, java.lang.String action) {
    return qValuesDAO.getQValue(s.toString(), action);
}