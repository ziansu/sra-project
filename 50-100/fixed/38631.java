public void addToMap(java.lang.String string) {
    if (frequency.isEmpty()) {
        frequency.put(string, 1);
    }else {
        java.lang.Integer count = frequency.get(string);
        if (count == null) {
            frequency.put(string, 1);
        }else {
            frequency.put(string, (count + 1));
        }
    }
}