private static java.util.List<com.smokebox.lib.utils.IntVector2> getStringAsVectors(java.lang.String string) {
    java.util.List<com.smokebox.lib.utils.IntVector2> locs = new java.util.ArrayList<>();
    java.lang.String[] splits = string.split(" ");
    for (java.lang.String s : splits) {
        if (s.isEmpty()) {
            break;
        }
        java.lang.String[] coord = s.split(",");
        locs.add(new com.smokebox.lib.utils.IntVector2(java.lang.Integer.parseInt(coord[0]), java.lang.Integer.parseInt(coord[1])));
    }
    return locs;
}