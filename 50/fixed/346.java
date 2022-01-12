public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    createAdapter();
    super.createHeaders("Milestones in:", ("Project: " + (this.mCallbacks.getSelectedProject().getName())));
}