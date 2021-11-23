public static void main(java.lang.String[] args) throws java.io.IOException, javax.xml.bind.JAXBException {
    java.lang.String listRecords = Endpoint.RELATIONS.listRecords();
    java.net.HttpURLConnection c = de.prometheus.bildarchiv.GentleUtils.getConnectionFor(listRecords);
    javax.xml.bind.JAXBElement<org.openarchives.beans.OAIPMHtype> oai = de.prometheus.bildarchiv.GentleUtils.getElement(c);
    java.util.List<org.openarchives.beans.RecordType> records = oai.getValue().getListRecords().getRecord();
    for (org.openarchives.beans.RecordType recordType : records) {
        java.lang.System.out.println(recordType.getMetadata().getRelation());
    }
}