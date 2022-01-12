public void setAvatar(byte[] avatar) {
    final com.parse.ParseFile file = new com.parse.ParseFile("avatar.png", avatar);
    file.saveInBackground(new com.parse.SaveCallback() {
        @java.lang.Override
        public void done(com.parse.ParseException e) {
            put(Const.COL_NAME_AVATAR, file);
            saveEventually();
        }
    });
}