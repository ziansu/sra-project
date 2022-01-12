public static pooky.util.Sheet getDoctrineStatic(java.util.Set<pooky.doctrine.DoctrineNode> set) {
    java.util.Set<pooky.doctrine.DoctrineHelper.DoctrineStatic> statics = new java.util.HashSet<pooky.doctrine.DoctrineHelper.DoctrineStatic>();
    for (pooky.doctrine.DoctrineNode node : set) {
        java.util.Set<java.lang.Object> s = new java.util.HashSet<java.lang.Object>();
        java.lang.Integer count = 0;
        java.util.List<pooky.doctrine.DoctrineHelper.DoctrineStatic> list = pooky.doctrine.DoctrineHelper.mergeDoctrineData(node);
        statics.addAll(list);
    }
    return pooky.doctrine.DoctrineHelper.convertStaticToSheet(statics);
}