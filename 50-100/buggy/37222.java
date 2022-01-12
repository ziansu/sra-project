@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null) {
        com.crowdsocial.util.ParseErrorHandler.handleError(e);
    }else {
        if ((invitees.size()) > 0) {
            java.lang.String eventId = event.getObjectId();
            sendEmail(getString(R.string.invitation_crowdsocial), getEmailBody(com.crowdsocial.util.ParseUserUtil.getLoggedInUser().getEmail(), event.getTitle(), event.getImageUrl(), (((com.crowdsocial.activity.CreateEventActivity.EMAIL_URL) + "/event/") + eventId)), getInviteeEmails(invitees));
        }
    }
}