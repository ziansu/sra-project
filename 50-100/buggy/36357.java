public java.lang.String getMultiLevelDropdownIds() throws java.lang.Exception {
    java.lang.StringBuilder dropdownIdsBuilder = new java.lang.StringBuilder();
    java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashSet<java.lang.String>> choicesByDropdownId = calculateChoicesByDropdownId();
    for (java.lang.String id : choicesByDropdownId.keySet()) {
        if ((dropdownIdsBuilder.length()) > 0) {
            dropdownIdsBuilder.append(",");
        }
        dropdownIdsBuilder.append(id);
    }
    return dropdownIdsBuilder.toString();
}