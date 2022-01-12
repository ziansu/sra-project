public void removeDataOlderThan(long time) {
    java.util.Iterator<com.builtbroken.jlib.type.Pair<java.lang.Long, java.lang.Integer>> it = iterator();
    while (it.hasNext()) {
        com.builtbroken.jlib.type.Pair<java.lang.Long, java.lang.Integer> entry = it.next();
        if ((entry.left()) < time) {
            it.remove();
        }
    } 
}