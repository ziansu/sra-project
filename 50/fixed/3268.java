@java.lang.Override
protected void eraseConnectionFeedback(org.eclipse.gef.requests.BendpointRequest request) {
    getFeedbackLayer().getChildren().clear();
    super.eraseConnectionFeedback(request);
}