public void deletePlan(java.lang.String name) {
    mPlan.clear();
    updatePlan();
    mSavedPlans.remove(name);
    mPref.putPlans(com.ds.avareplus.place.Plan.putAllPlans(mService, mSavedPlans));
}