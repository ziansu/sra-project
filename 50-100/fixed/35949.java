public void spillAllReg() {
    for (java.lang.String key : map.keySet()) {
        java.lang.String value = map.get(key);
        if (!(value.equals("null"))) {
            java.lang.System.out.println((";Spilling variable: " + value));
            java.lang.System.out.println(((("move " + key) + " ") + (getTinyTransform(value))));
            map.put(key, "null");
        }
    }
}