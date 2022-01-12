@java.lang.Override
public io.reactivex.Maybe<com.avtarkhalsa.lvexample.models.Question> popQuestion(com.avtarkhalsa.lvexample.models.Question q) {
    if (completedQuestionsLookup.containsKey(q.getId())) {
        com.avtarkhalsa.lvexample.models.Question qToRemove = questionStack.get(((questionStack.size()) - 1));
        questionStack.remove(qToRemove);
        completedQuestionsLookup.remove(qToRemove.getId());
    }
    return io.reactivex.Maybe.just(questionStack.get(((questionStack.size()) - 1)));
}