private static void substituteAllProperties() {
    java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> it = com.servoy.j2db.util.Settings.getInstance().entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry<java.lang.String, java.lang.String> entry = ((java.util.Map.Entry) (it.next()));
        entry.setValue(com.servoy.j2db.util.Settings.substituteProperties(entry.getValue(), null));
    } 
}