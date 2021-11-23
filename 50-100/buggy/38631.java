public void addToMap(java.lang.String string) {
    java.lang.Integer count = frequency.get(string);
    if (count == null) {
        frequency.put(string, 1);
    }else {
        frequency.put(string, (count + 1));
    }
}