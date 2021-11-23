public static com.emi.nwodcombat.model.realm.Entry newInstance() {
    com.emi.nwodcombat.model.realm.Entry entry = new com.emi.nwodcombat.model.realm.Entry();
    entry.setId(com.emi.nwodcombat.model.realm.Entry.lastId);
    (com.emi.nwodcombat.model.realm.Entry.lastId)++;
    return entry;
}