public java.lang.String getSortingStr(java.lang.String coreName) {
    java.util.Map<java.lang.String, java.lang.String> sorting = new java.util.HashMap<>();
    sorting.put("gene", "&sort=marker_symbol asc");
    sorting.put("mp", "&sort=mp_term asc");
    sorting.put("disease", "&sort=disease_term asc");
    sorting.put("anatomy", "&sort=term asc");
    sorting.put("impc_images", "");
    sorting.put("images", "");
    return sorting.get(coreName);
}