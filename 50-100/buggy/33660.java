private java.lang.String getCateKey(java.lang.String key) {
    for (java.lang.String cateKey : this.categories.keySet()) {
        java.util.List<java.lang.String> list = categories.get(cateKey);
        if (list.contains(key)) {
            java.lang.System.out.println(cateKey);
            return cateKey;
        }
    }
    return null;
}