public static int[] parseIntArray(org.json.JSONArray arr) {
    if (arr == null)
        return null;
    
    int[] res = new int[arr.length()];
    for (int i = 0; i < (arr.length()); i++) {
        res[i] = arr.optInt(i);
    }
    return res;
}