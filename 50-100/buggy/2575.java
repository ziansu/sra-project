public java.util.List<java.lang.Integer> getCheckedList() {
    java.util.List<java.lang.Integer> result = new java.util.ArrayList<java.lang.Integer>();
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Boolean> checkedEntry : checkedMap.entrySet()) {
        if ((checkedEntry.getValue()) == true)
            result.add(checkedEntry.getKey());
        
    }
    return result;
}