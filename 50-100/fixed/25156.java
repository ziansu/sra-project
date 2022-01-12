@java.lang.Override
public java.util.List<java.lang.Object> toList() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(0, this.nr);
    list.add(1, this.bezeichnung);
    list.add(2, this.beschreibung);
    list.add(3, this.art);
    list.add(4, this.preis);
    return list;
}