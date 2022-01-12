public java.lang.Integer[] convertFromArrayList(java.util.ArrayList<java.lang.Integer> before) {
    java.lang.Integer[] after = new java.lang.Integer[before.size()];
    java.lang.System.out.println(before);
    for (int i = 0; i < (after.length); i++) {
        after[i] = before.get(i);
    }
    return after;
}