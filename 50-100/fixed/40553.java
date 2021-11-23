public java.lang.String toString() {
    java.lang.StringBuilder str = new java.lang.StringBuilder();
    for (java.lang.String config : styles.keySet()) {
        if (config.equals("type")) {
            continue;
        }
        str.append((((config + "=") + (styles.get(config))) + ","));
    }
    return str.toString().trim();
}