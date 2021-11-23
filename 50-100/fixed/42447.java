private void feed(java.lang.String content, boolean isSpam) {
    java.util.Map<java.lang.String, java.lang.Double> map = (isSpam) ? spam : ham;
    for (java.lang.String word : content.split("\\s+")) {
        java.lang.Double val = (map.containsKey(word)) ? map.get(word) : 0.0;
        map.put(word, (++val));
    }
}