public static java.lang.String toMapString(java.util.Map<java.lang.String, java.lang.Object> data, java.lang.String result) {
    for (java.lang.String key : data.keySet()) {
        if ((data.get(key)) instanceof java.util.Map) {
            result = com.eweblib.search.index.LuceneIndexHelper.toMapString(((java.util.Map<java.lang.String, java.lang.Object>) (data.get(key))), result);
        }else {
            result = (result + " ") + (data.get(key));
        }
    }
    return result;
}