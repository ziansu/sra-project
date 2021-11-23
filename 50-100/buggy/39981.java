java.util.ArrayList<java.lang.String> removeDuplicates(java.util.ArrayList<java.lang.String> parsedIntArgumentList) {
    java.util.HashSet<java.lang.String> hs = new java.util.HashSet<>();
    hs.addAll(parsedIntArgumentList);
    parsedIntArgumentList.clear();
    parsedIntArgumentList.addAll(hs);
    return parsedIntArgumentList;
}