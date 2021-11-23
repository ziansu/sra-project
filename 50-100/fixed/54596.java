public java.lang.String getReplyTo(com.zulip.android.ZulipApp app) {
    if ((this.getType()) == (MessageType.STREAM_MESSAGE)) {
        return this.getSender().getEmail();
    }else {
        com.zulip.android.models.Person[] people = this.getRecipients(app);
        return com.zulip.android.models.Message.emailsMinusYou(java.util.Arrays.asList(people), app.getYou());
    }
}