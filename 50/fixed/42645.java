public void deletePlan(java.lang.String name) {
    if ((mPlan) != null) {
        mPlan.clear();
    }
    updatePlan();
    mSavedPlans.remove(name);
    mPref.putPlans(com.ds.avareplus.place.Plan.putAllPlans(mService, mSavedPlans));
}