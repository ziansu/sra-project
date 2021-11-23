public java.util.List<java.lang.String> toList() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    list.add(0, ((this.nr) + ""));
    list.add(1, this.bezeichnung);
    list.add(2, this.beschreibung);
    list.add(3, ((this.art) + ""));
    list.add(4, ((this.preis) + ""));
    return list;
}