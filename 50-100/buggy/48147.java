private de.uni_potsdam.hpi.bpt.bp2014.jcomparser.xml.Fragment createAndInitializeFragment(java.lang.String fragmentID) {
    de.uni_potsdam.hpi.bpt.bp2014.jcomparser.Retrieval retrieval = new de.uni_potsdam.hpi.bpt.bp2014.jcomparser.Retrieval();
    java.lang.String fragmentXML = retrieval.getHTMLwithAuth(this.processeditorServerUrl, ((((this.processeditorServerUrl) + "models/") + fragmentID) + ".pm"));
    de.uni_potsdam.hpi.bpt.bp2014.jcomparser.xml.Fragment fragment = new de.uni_potsdam.hpi.bpt.bp2014.jcomparser.xml.Fragment();
    fragment.initializeInstanceFromXML(stringToDocument(fragmentXML));
    return fragment;
}