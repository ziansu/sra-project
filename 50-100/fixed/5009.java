@java.lang.Override
public io.reactivex.Maybe<com.avtarkhalsa.lvexample.models.Question> popQuestion(com.avtarkhalsa.lvexample.models.Question q) {
    if (completedQuestionsLookup.containsKey(q.getId())) {
        questionStack.remove(((questionStack.size()) - 1));
        completedQuestionsLookup.remove(q.getId());
    }
    return io.reactivex.Maybe.just(questionStack.get(((questionStack.size()) - 1)));
}