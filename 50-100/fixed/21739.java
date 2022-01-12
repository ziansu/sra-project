private void keyUnion() {
    keys = new java.util.Vector<java.lang.String>();
    allSets();
    for (java.util.HashMap<java.lang.String, java.lang.String> headphone : headphoneSet) {
        for (java.lang.String key : headphone.keySet()) {
            if (!(keys.contains(key))) {
                keys.addElement(key);
                java.lang.System.out.println(key);
            }
        }
    }
}