public static java.lang.String emailsMinusYou(java.util.List<com.zulip.android.models.Person> people, com.zulip.android.models.Person you) {
    java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<>();
    for (com.zulip.android.models.Person person : people) {
        if ((person.id) != (you.id)) {
            names.add(person.getEmail());
        }
    }
    return android.text.TextUtils.join(", ", names);
}