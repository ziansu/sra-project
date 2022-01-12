private void generateAttributes(android.content.Context c) {
    questionablequality.rpglifeapp.data.Random r = new questionablequality.rpglifeapp.data.Random();
    for (java.lang.String S : c.getResources().getStringArray(R.array.attributes)) {
        attributes.put(S, ((r.nextInt(5)) + 1));
    }
}