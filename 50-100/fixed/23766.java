public void sendSupportFeedback(@lombok.NonNull
org.icgc.dcc.submission.core.model.Feedback feedback) {
    sendNotification(java.lang.String.format("Feedback from %s - '%s'", feedback.getEmail(), feedback.getSubject()), feedback.getMessage());
    send(feedback.getEmail(), properties.getEmail().getSupportEmail(), feedback.getSubject(), feedback.getMessage());
}