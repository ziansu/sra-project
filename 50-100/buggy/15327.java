public java.lang.Iterable<me.sjtumeow.meow.model.result.AnswerSummaryResult> getAnswerSummary(java.lang.Iterable<me.sjtumeow.meow.model.Answer> answers) {
    java.util.List<me.sjtumeow.meow.model.result.AnswerSummaryResult> result = new java.util.ArrayList<me.sjtumeow.meow.model.result.AnswerSummaryResult>();
    for (me.sjtumeow.meow.model.Answer answer : answers) {
        result.add(new me.sjtumeow.meow.model.result.AnswerSummaryResult(answer, getAnswerDetail(answer)));
    }
    return result;
}