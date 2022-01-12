public void trimEntries() {
    roomsearch.Keywords regex = new roomsearch.Keywords();
    java.lang.String[] keys = regex.getKeywords();
    for (int i = 0; i < (list.size()); i++) {
        for (int j = 0; j < (keys.length); j++) {
            list.set(i, list.get(i).toString().replace(keys[j], ""));
        }
    }
}