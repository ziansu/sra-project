public uk.co.rpl.sisTest.Team create(java.lang.String name, java.lang.String city, java.lang.String owner, java.lang.String competition) {
    java.lang.String id = nameToId.get(name);
    if (id == null)
        id = "" + (this.id.incrementAndGet());
    
    uk.co.rpl.sisTest.Team t = new uk.co.rpl.sisTest.Team(id, name, city, owner, competition);
    store.put(id, t);
    return t;
}