public void keyUnion() {
    allSets();
    for (java.util.HashMap<java.lang.String, java.lang.String> headphone : headphoneSet) {
        for (java.lang.String key : headphone.keySet()) {
            if (!(keys.contains(key))) {
                keys.addElement(key);
            }
        }
    }
}