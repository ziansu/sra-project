public static boolean shouldInsert(java.lang.String url) {
    if ((!(plugins.CENO.Bridge.BundleInserter.insertTable.containsKey(url))) || (((new java.util.Date().getTime()) - (plugins.CENO.Bridge.BundleInserter.insertTable.get(url).getTime())) > (plugins.CENO.Bridge.BundleInserter.SHOULD_REINSERT))) {
        plugins.CENO.Bridge.BundleInserter.insertTable.put(url, new java.util.Date(((new java.util.Date().getTime()) + (plugins.CENO.Bridge.BundleInserter.SHOULD_REINSERT))));
        return true;
    }else {
        return false;
    }
}