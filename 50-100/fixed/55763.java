public com.jingtao.app.main_page_list_view.Model checksaved() {
    java.util.ArrayList<com.jingtao.app.main_page_list_view.Model> savedQuestionList = new java.util.ArrayList<>();
    savedQuestionList = ReadSavedQuestion();
    if (savedQuestionList == null)
        return null;
    
    for (com.jingtao.app.main_page_list_view.Model qst : savedQuestionList) {
        if (qst.getId().equals(question.getId()))
            return qst;
        
    }
    return null;
}