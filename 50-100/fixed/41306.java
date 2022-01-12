private java.util.HashMap<java.lang.String, java.lang.Integer> categoryDifficultyMap(java.util.List<symposium.Panel> panels) {
    java.util.HashMap<java.lang.String, java.lang.Integer> m = new java.util.HashMap<>();
    for (symposium.Panel panel : panels) {
        for (java.lang.String category : panel.CATEGORIES) {
            if (m.containsKey(category)) {
                m.put(category, ((m.get(category)) + 1));
            }else {
                m.put(category, 1);
            }
        }
    }
    return m;
}