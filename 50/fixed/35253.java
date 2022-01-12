private void setDomainModel() {
    domainModelXML = fetchDomainModelXML();
    if ((domainModelXML) != null) {
        domainModel = new de.uni_potsdam.hpi.bpt.bp2014.jcomparser.xml.DomainModel(processeditorServerUrl);
        domainModel.initializeInstanceFromXML(domainModelXML);
    }
}