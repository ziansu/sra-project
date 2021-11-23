public void setCardId(java.lang.String name, java.lang.String ID, int ent_id) {
    try {
        Card c = new Card();
        c = cardsByID.get(ID);
        c.name = name;
        c.EntityID = ent_id;
        cards.put(name, c);
    } catch (java.lang.Exception e) {
    }
}