static void printWordCounts(java.util.Map<java.lang.String, java.lang.Integer> lookup) {
    for (java.lang.String keyword : lookup.keySet()) {
        assert keyword != null;
        java.lang.Integer count = lookup.get(keyword);
        assert count != null;
        java.lang.System.out.println((((count.toString()) + " ") + keyword));
    }
}