public void mergeAll() {
    for (int i = 0; i < (org.lbchild.xml.XMLMerger.directoryList.size()); i++) {
        mergeXml(new java.io.File(((((path) + "/") + (userName)) + (org.lbchild.xml.XMLMerger.NEWSMARKS))), new java.io.File(((((path) + "/") + (org.lbchild.xml.XMLMerger.directoryList.get(i).getName())) + (org.lbchild.xml.XMLMerger.NEWSMARKS))));
    }
}