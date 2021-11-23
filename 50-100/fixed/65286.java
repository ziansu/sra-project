@java.lang.Override
public amai.org.conventions.model.ConventionEvent.UserInput clone() throws java.lang.CloneNotSupportedException {
    amai.org.conventions.model.ConventionEvent.UserInput newInput = ((amai.org.conventions.model.ConventionEvent.UserInput) (super.clone()));
    newInput.feedback = feedback.clone();
    newInput.eventFeedbackReminderNotification = eventFeedbackReminderNotification.clone();
    newInput.eventAboutToStartNotification = eventAboutToStartNotification.clone();
    newInput.voteSurvey = ((voteSurvey) == null) ? null : voteSurvey.clone();
    return newInput;
}