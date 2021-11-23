@java.lang.Override
public int addHistory(int userid, int examid, int questionid, java.util.List<java.lang.Integer> answeridList, java.lang.String status) {
    com.dli.services.impl.ExamHistory h = new com.dli.services.impl.ExamHistory();
    h.setExam_id(examid);
    h.setUser_id(userid);
    examRepo.addExamHistroy(h);
    int historyid = h.getHistory_id();
    addExamRecord(historyid, questionid, answeridList, status);
    return historyid;
}