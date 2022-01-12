void addField(java.lang.String key, java.lang.String alephKeyword) {
    if ((key == null) || (alephKeyword == null)) {
        return ;
    }
    values.put(key, alephKeyword);
}