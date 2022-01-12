public void putId(java.lang.String id) {
    put("inviteId", id);
    saveInBackground(new com.parse.SaveCallback() {
        @java.lang.Override
        public void done(com.parse.ParseException e) {
            if (e != null) {
                android.util.Log.d(grouphub.travelshare.InvitationID.TAG, ("Error adding id to Invitation id: " + e));
            }
        }
    });
}