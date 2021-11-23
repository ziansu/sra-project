private void writeNoteAttachmentEmailBody2(org.socialbiz.cog.AuthRequest ar, org.socialbiz.cog.OptOutAddr ooa, org.workcast.json.JSONObject data) throws java.lang.Exception {
    org.socialbiz.cog.UserProfile ownerProfile = ar.getUserProfile();
    if (ownerProfile == null) {
        throw new java.lang.Exception("Some problem, so some reason the owner user profile is null");
    }
    data.put("optout", ooa.getUnsubscribeJSON(ar));
    java.io.File myTemplate = ar.getCogInstance().getConfig().getFileFromRoot("email/DiscussionTopicManual.chtml");
    org.socialbiz.cog.mail.ChunkTemplate.streamIt(ar.w, myTemplate, data, ooa.getCalendar());
}