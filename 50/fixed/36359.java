public void postPlanSuccessful(java.lang.String string) {
    mGoals.add(0, new com.ckt.ckttodo.model.Goal(string));
    mAdapter.notify(AnimationType.ADD, 0);
}