@java.lang.Override
public ai.grakn.graql.admin.AnswerExplanation merge(ai.grakn.graql.admin.AnswerExplanation a2) {
    ai.grakn.graql.admin.AnswerExplanation exp = new ai.grakn.graql.internal.reasoner.explanation.Explanation();
    if (this.isJoinExplanation())
        this.getAnswers().forEach(exp::addAnswer);
    
    if (a2.isJoinExplanation())
        a2.getAnswers().forEach(exp::addAnswer);
    
    return exp;
}