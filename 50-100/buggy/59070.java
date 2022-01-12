public void add(java.lang.Integer key, java.lang.Integer newValue, java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> prevMap) {
    java.util.List<java.lang.Integer> currentValue = prevMap.get(key);
    if (currentValue == null) {
        currentValue = new java.util.ArrayList();
        prevMap.put(key, currentValue);
    }
    currentValue.add(newValue);
}