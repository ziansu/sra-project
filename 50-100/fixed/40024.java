public com.louiscarrese.clopecounter.model.Jour getToday() {
    io.realm.Realm realm = io.realm.Realm.getDefaultInstance();
    io.realm.RealmQuery<com.louiscarrese.clopecounter.model.Jour> query = realm.where(com.louiscarrese.clopecounter.model.Jour.class);
    query.equalTo("date", this.getCurrentDate());
    com.louiscarrese.clopecounter.model.Jour jour = query.findFirst();
    if (jour == null) {
        purge();
        jour = initJour(this.getCurrentDate());
    }
    return jour;
}