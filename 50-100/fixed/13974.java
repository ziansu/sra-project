private void setGraphParameters(java.util.ArrayList<java.util.ArrayList<java.lang.String>> result) {
    java.util.ArrayList<java.lang.String> highValue = result.get(0);
    labels = result.get(1);
    for (int i = 0; i < (highValue.size()); i++) {
        java.lang.String high = highValue.get(i);
        com.github.mikephil.charting.data.Entry entry = new com.github.mikephil.charting.data.Entry(java.lang.Float.parseFloat(high), i);
        entries.add(entry);
    }
}