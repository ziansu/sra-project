public void addMember(android.content.Context context, java.lang.String authorId) {
    boolean newChat = false;
    if ((members) == null) {
        newChat = true;
        members = new java.util.ArrayList<>();
    }
    members.add(authorId);
    project.sherpa.utilities.ContentProviderUtils.insertChat(context, this);
    if (newChat) {
        project.sherpa.utilities.FirebaseProviderUtils.insertOrUpdateModel(this);
    }else {
        addMemberToFirebase(authorId);
    }
}