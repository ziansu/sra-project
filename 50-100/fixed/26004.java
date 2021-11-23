public void mergeAll() {
    for (int i = 0; i < (org.lbchild.xml.XMLMerger.directoryList.size()); i++) {
        mergeXml((((path) + (userName)) + (org.lbchild.xml.XMLMerger.NEWSMARKS)), (((path) + (org.lbchild.xml.XMLMerger.directoryList.get(i).getName())) + (org.lbchild.xml.XMLMerger.NEWSMARKS)));
    }
}