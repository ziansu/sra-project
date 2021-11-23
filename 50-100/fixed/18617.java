public java.lang.String regLookup(java.lang.String op) {
    for (java.lang.String key : this.map.keySet()) {
        java.lang.String value = this.map.get(key);
        if (op.equals(value)) {
            return key;
        }
    }
    return null;
}