public void maalSelect() {
    int id = java.lang.Integer.parseInt(maal_list.getValue());
    retrieve.getRow(id);
    fillMaal(id);
}