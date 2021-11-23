private void parseDays(java.util.HashMap<java.lang.String, java.lang.Object> map) {
    if (map != null) {
        for (java.lang.String day : map.keySet()) {
            int d = java.lang.Integer.parseInt(day);
            parseTask(d, ((java.util.HashMap<java.lang.String, java.util.Objects>) (map.get(day))));
        }
    }
}