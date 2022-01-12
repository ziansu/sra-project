static void printWordCounts(java.util.Map<java.lang.CharSequence, java.lang.Integer> lookup) {
    for (java.lang.CharSequence keyword : lookup.keySet()) {
        assert keyword != null;
        java.lang.Integer count = lookup.get(keyword);
        assert count != null;
        java.lang.System.out.println((((count.toString()) + " ") + keyword));
    }
}