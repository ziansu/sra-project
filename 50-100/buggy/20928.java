public static void cutIfHasNoConcept() {
    for (java.util.Iterator<mining.TempResult.Node> it = mining.TempResult.roots.iterator(); it.hasNext();) {
        mining.TempResult.Node n = it.next();
        if (mining.TempResult.cut(n)) {
            it.remove();
        }
    }
}