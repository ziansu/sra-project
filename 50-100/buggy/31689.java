public java.util.List<? extends com.quizdeck.model.database.Submissions> getAllSubmissionsAndRemove(java.lang.String quizId) {
    java.util.List<com.quizdeck.model.database.Submissions> subs = new java.util.ArrayList<>();
    for (int i = 0; i < (listOps.size(((prefix) + quizId))); i++) {
        subs.add(listOps.leftPop(((prefix) + quizId)));
    }
    return subs;
}