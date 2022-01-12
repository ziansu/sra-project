public java.util.ArrayList<java.lang.String> generateFilteredStringList(java.lang.String newText) {
    if ((LocationMap) == null) {
        return null;
    }else {
        for (java.lang.String key : totalStringList) {
            if (checkKey(key.toLowerCase(), newText.toLowerCase())) {
                filteredStringList.add(key);
            }
        }
        java.util.Collections.sort(filteredStringList);
        return filteredStringList;
    }
}