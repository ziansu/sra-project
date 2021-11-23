public static java.lang.String emailsMinusYou(com.zulip.android.models.List<com.zulip.android.models.Person> people, com.zulip.android.models.Person you) {
    com.zulip.android.models.ArrayList<java.lang.String> names = new com.zulip.android.models.ArrayList();
    for (com.zulip.android.models.Person person : people) {
        if ((person.id) != (you.id)) {
            names.add(person.getEmail());
        }
    }
    return android.text.TextUtils.join(", ", names);
}