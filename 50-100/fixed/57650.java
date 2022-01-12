public void setScore(final org.justcards.android.models.User user) {
    if ((user != null) && (!(cz.msebera.android.httpclient.util.TextUtils.isEmpty(user.getUserId())))) {
        mUsersDbRef.child(user.getUserId()).child("score").setValue(user.getScore());
    }
}