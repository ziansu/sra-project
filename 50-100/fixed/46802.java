public void setCardId(java.lang.String name, java.lang.String ID) {
    try {
        Card c = new Card();
        c = cardsByID.get(ID);
        c.id = ID;
        c.name = name;
        cards.put(name, c);
    } catch (java.lang.Exception e) {
    }
}