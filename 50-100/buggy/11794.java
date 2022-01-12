private com.louiscarrese.clopecounter.model.Jour createJour() {
    io.realm.Realm realm = io.realm.Realm.getDefaultInstance();
    long id = (realm.where(com.louiscarrese.clopecounter.model.Jour.class).maximumInt("id")) + 1;
    com.louiscarrese.clopecounter.model.Jour j = new com.louiscarrese.clopecounter.model.Jour();
    j.setId(id);
    return j;
}