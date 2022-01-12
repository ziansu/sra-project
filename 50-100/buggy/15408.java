public java.util.List<java.util.List<java.lang.String>> groupStrings(java.lang.String[] strings) {
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> groupedStrings = new java.util.HashMap<>();
    for (java.lang.String originalStr : strings) {
        java.lang.String shiftedStr = shiftString(originalStr);
        groupedStrings.putIfAbsent(originalStr, new java.util.ArrayList<>());
        groupedStrings.get(originalStr).add(shiftedStr);
    }
    return groupedStrings.values().stream().collect(java.util.stream.Collectors.toList());
}