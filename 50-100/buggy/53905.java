public com.louiscarrese.clopecounter.model.Jour addClope(com.louiscarrese.clopecounter.model.Jour jour) {
    io.realm.Realm realm = io.realm.Realm.getInstance(this.context);
    realm.beginTransaction();
    com.louiscarrese.clopecounter.model.Clope clope = new com.louiscarrese.clopecounter.model.Clope();
    clope.setDate(new java.util.Date());
    jour.setNbClopes(((jour.getNbClopes()) + 1));
    jour.setAvg7Predict(computeAvg(clope.getDate(), (-7), 0));
    realm.copyToRealm(clope);
    realm.commitTransaction();
    return jour;
}