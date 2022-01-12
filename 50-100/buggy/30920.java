public static java.util.HashMap<java.lang.String, im.vector.adapters.ParticipantAdapterItem> listKnownParticipants(org.matrix.androidsdk.MXSession session) {
    java.util.HashMap<java.lang.String, im.vector.adapters.ParticipantAdapterItem> map = new java.util.HashMap<>();
    java.util.Collection<org.matrix.androidsdk.rest.model.User> users = session.getDataHandler().getStore().getUsers();
    for (org.matrix.androidsdk.rest.model.User user : users) {
        if (!(org.matrix.androidsdk.call.MXCallsManager.isConferenceUserId(user.user_id))) {
            map.put(user.user_id, new im.vector.adapters.ParticipantAdapterItem(user));
        }
    }
    return map;
}