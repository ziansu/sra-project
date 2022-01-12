private static int getIntentionOrder(int order, java.util.Collection<java.lang.Long> intentions, java.util.Collection<com.loocha.exam.bean.ExamDecision> decisions) {
    int num = 0;
    java.util.List<java.lang.Long> ids = com.loocha.exam.process.IntentionProcessor.getDecisionIds(decisions, order);
    num = com.loocha.exam.process.IntentionProcessor.getMatchNum(intentions, ids);
    return num;
}