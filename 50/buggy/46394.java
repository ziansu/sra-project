public void add(java.lang.String key, java.lang.String value) {
    java.lang.String jsonOrder = (("\"" + key) + "\":") + value;
    this.list.add(jsonOrder);
}