public boolean onRowEdit(java.lang.String testId, org.primefaces.event.RowEditEvent event) {
    try {
        ((com.bionic.university.model.QuestionRow) (event.getObject())).getQuestion().setTest(testService.getTestDAO().find(java.lang.Integer.valueOf(testId)));
        questionDAO.update(((com.bionic.university.entity.Question) (event.getObject())));
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
}