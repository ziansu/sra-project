public java.lang.String getResponse(java.lang.Integer rowId) {
    java.util.List<gov.va.escreening.dto.ae.Answer> answers = getUserAnswers(getAnswerId());
    if (rowId == 0)
        return answers.get(0).getAnswerResponse();
    
    for (gov.va.escreening.dto.ae.Answer answer : answers) {
        if ((answer.getRowId()) == rowId)
            return answer.getAnswerResponse();
        
    }
    return "";
}