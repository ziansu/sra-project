public void stopDefaultBehaviour() {
    this.activityController.getCurrentActivity().setDefault(false);
    this.activityController.requestActivityFinish(this.activityController.getCurrentActivity());
}