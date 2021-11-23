private void handleAffiliation() throws org.xml.sax.SAXException {
    eu.dnetlib.iis.ingest.pmc.metadata.schemas.Affiliation currentAffiliation = buildAffiliation();
    if (currentAffiliation != null) {
        int currentAffiliationPosition = builder.getAffiliations().size();
        if (assignAuthorsForAffiliation(currentAffiliation, currentAffiliationPosition)) {
            builder.getAffiliations().add(currentAffiliation);
        }
    }
    affiliationText.setLength(0);
}