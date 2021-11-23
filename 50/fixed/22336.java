protected java.lang.String getAnswerColumn(int i) {
    switch (i) {
        case 0 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_CORRECT_ANSWER;
        case 1 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_ANSWER_2;
        case 2 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_ANSWER_3;
        case 3 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_ANSWER_4;
        default :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_CORRECT_ANSWER;
    }
}