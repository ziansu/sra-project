public void setAvatar(byte[] avatar) {
    final com.parse.ParseFile file = new com.parse.ParseFile("avatar.png", avatar);
    android.util.Log.w("Yuval", ("setAvatar(). size == " + (avatar.length)));
    file.saveInBackground(new com.parse.SaveCallback() {
        @java.lang.Override
        public void done(com.parse.ParseException e) {
            android.util.Log.w("Yuval", "setAvatar() - in done");
            put(Const.COL_NAME_AVATAR, file);
            saveEventually();
        }
    });
}