public java.util.List<? extends com.quizdeck.model.database.Submissions> getAllSubmissionsAndRemove(java.lang.String quizId) {
    java.util.List<com.quizdeck.model.database.Submissions> subs = new java.util.ArrayList<>();
    long length = listOps.size(((prefix) + quizId));
    for (int i = 0; i < length; i++) {
        subs.add(listOps.leftPop(((prefix) + quizId)));
    }
    return subs;
}