@java.lang.Override
public int getCorrectPoints(data.QuizSession session) throws java.sql.SQLException {
    java.lang.String their_answer = session.getResponseParam(((data.BasicQuestion.TYPE_TAG) + (id)));
    if ((their_answer != null) && (their_answer.toLowerCase().equals(answer.toLowerCase())))
        return 1;
    
    return 0;
}