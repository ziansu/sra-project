public static void continuous(java.util.List<java.lang.String> oldlist) {
    oldlist = pers.zylo117.spotspotter.fileprocessor.FIndexReader.getFIndex(CentralControl.monitorPath, false);
    final java.util.List<java.lang.String> newlist = pers.zylo117.spotspotter.fileprocessor.FIndexReader.getFIndex(CentralControl.monitorPath, true);
    newlist.removeAll(oldlist);
    if (!(newlist.isEmpty()))
        oldlist = newlist;
    
    pers.zylo117.spotspotter.fileprocessor.FIndexReader.indexProcess(CentralControl.monitorPath, oldlist);
}