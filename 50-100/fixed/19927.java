@java.lang.Override
public int removeQuestions(java.util.List<howardwu.io.ors.api.model.Question> questions, java.lang.String questionnaireIdentifier) {
    if (questions.isEmpty()) {
        return 0;
    }
    return getSqlSession().delete(((namespace) + ".removeQuestions"), howardwu.io.ors.api.common.utils.CollectionUtil.map(new java.lang.String[]{ "questionnaireIdentifier" , "rows" }, new java.lang.Object[]{ questionnaireIdentifier , questions }));
}