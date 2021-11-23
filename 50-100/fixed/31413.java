private void generateAttributes(android.content.Context c) {
    java.util.Random r = new java.util.Random();
    for (java.lang.String S : c.getResources().getStringArray(R.array.attributes)) {
        attributes.put(S, ((r.nextInt(5)) + 1));
    }
}