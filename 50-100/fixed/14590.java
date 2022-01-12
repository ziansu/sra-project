@java.lang.Override
public void onSuccess(java.lang.String result) {
    this.appliedList = createGsonFromString(result);
    java.util.ArrayList<com.sg.clockwork.model.Post> withoutCompletedJob = new java.util.ArrayList<com.sg.clockwork.model.Post>();
    for (com.sg.clockwork.model.Post p : appliedList) {
        if (!(p.getStatus().equalsIgnoreCase("completed"))) {
            withoutCompletedJob.add(p);
        }
    }
    this.appliedList = withoutCompletedJob;
    setListingAdapter(new com.sg.clockwork.adapter.DashboardAdapter(fragmentActivity, withoutCompletedJob));
    dashboardView.displayAppliedJobListing(this);
}