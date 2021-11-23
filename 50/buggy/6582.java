public static boolean isSelf(final org.justcards.android.models.User user, final android.content.Context context) {
    return user == (org.justcards.android.models.User.getCurrentUser(context));
}