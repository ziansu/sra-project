@java.lang.Override
public void deleteAnswersByQuestionId(int quesid) {
    java.util.List<model.Answer> anss = ansDao.getAnswersByQuesId(quesid);
    if ((anss == null) || ((anss.size()) == 0))
        return ;
    
    for (model.Answer ans : anss) {
        model.AnswerSheet anst = anssheetDao.getAnswerSheetById(ans.getId());
        java.lang.System.out.println(anst.getId());
        deleteAnswer(ans, anst);
    }
}