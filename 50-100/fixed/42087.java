private void handleAffiliation() throws org.xml.sax.SAXException {
    eu.dnetlib.iis.ingest.pmc.metadata.schemas.Affiliation currentAffiliation = buildAffiliation();
    if (currentAffiliation != null) {
        int currentAffiliationPosition = builder.getAffiliations().size();
        builder.getAffiliations().add(currentAffiliation);
        assignAuthorsForAffiliation(currentAffiliationPosition);
    }
    affiliationText.setLength(0);
}