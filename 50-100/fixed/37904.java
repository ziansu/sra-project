public com.zulip.android.models.Person[] getPersonalReplyTo(com.zulip.android.ZulipApp app) {
    com.zulip.android.models.Person[] people = this.getRecipients(app);
    java.util.ArrayList<com.zulip.android.models.Person> names = new java.util.ArrayList<>();
    for (com.zulip.android.models.Person person : people) {
        if ((person.id) != (app.getYou().id)) {
            names.add(person);
        }
    }
    return people;
}