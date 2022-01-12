public static void continuous(java.util.List<java.lang.String> oldlist) {
    oldlist = pers.zylo117.spotspotter.fileprocessor.FIndexReader.getFIndex(false);
    final java.util.List<java.lang.String> newlist = pers.zylo117.spotspotter.fileprocessor.FIndexReader.getFIndex(true);
    newlist.removeAll(oldlist);
    if (!(newlist.isEmpty()))
        oldlist = newlist;
    
    pers.zylo117.spotspotter.fileprocessor.FIndexReader.indexProcess(CentralControl.monitorPath, oldlist);
}