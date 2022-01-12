private void sendMail(java.lang.String newMail) {
    new samurai.geeft.android.geeft.database.BaaSMail(samurai.geeft.android.geeft.utilities.TagsValue.DEFAULT_EMAIL, newMail, mCode).execute();
}