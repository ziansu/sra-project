public void save(final java.util.List<org.justcards.android.models.User> users) {
    if (!(org.justcards.android.utils.AppUtils.isEmpty(users))) {
        for (org.justcards.android.models.User user : users) {
            save(user);
        }
    }
}