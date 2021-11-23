public java.lang.String regLookup(java.lang.String op) {
    for (java.lang.String key : this.map.keySet()) {
        java.lang.String HashKey = key;
        java.lang.String HashValue = this.map.get(HashKey);
        if (op.equals(HashValue)) {
            return key;
        }
    }
    return "register not found";
}