public void postPlanSuccessful(java.lang.String string) {
    mGoals.addFirst(new com.ckt.ckttodo.model.Goal(string));
    mAdapter.notify(AnimationType.ADD, 0);
}