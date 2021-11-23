public void spillAllReg() {
    for (java.lang.String key : map.keySet()) {
        java.lang.String HashKey = key;
        java.lang.String HashValue = map.get(HashKey);
        if (!(HashValue.equals("null"))) {
            java.lang.System.out.println((";Spilling variable: " + HashValue));
            java.lang.System.out.println(((("move " + HashKey) + " ") + (getTinyTransform(HashValue))));
            map.put(HashKey, "null");
        }
    }
}