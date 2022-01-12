private void substituteAllProperties() {
    java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> it = entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry<java.lang.String, java.lang.String> entry = ((java.util.Map.Entry) (it.next()));
        entry.setValue(substituteProperties(entry.getValue(), null));
    } 
}