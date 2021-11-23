private java.lang.String getRandomFromList(java.util.List<java.lang.String> list) {
    android.widget.TextView phraseField = ((android.widget.TextView) (findViewById(R.id.phrase)));
    return com.decote.partygames.utils.RandomHelper.getNextRandomString(list, getApplicationContext());
}