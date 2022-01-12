public java.lang.Integer getUrlID(java.lang.String url, TermCounter tc) {
    if (Database.urlDB.containsKey(url)) {
        return ((java.lang.Integer) (Database.urlDB.get(url).keySet().toArray()[0]));
    }else {
        Database.urlDB.put(url, new java.util.HashMap<java.lang.Integer, java.lang.Integer>());
        int id = Database.ID;
        Database.urlDB.get(url).put(id, tc.getTranslations());
        (Database.ID)++;
        return id;
    }
}