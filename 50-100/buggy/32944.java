@java.lang.Override
protected void onStartDefinition() throws java.io.IOException, org.openforis.idm.metamodel.xml.XmlParseException, org.xmlpull.v1.XmlPullParserException {
    super.onStartDefinition();
    org.openforis.idm.metamodel.TaxonAttributeDefinition defn = ((org.openforis.idm.metamodel.TaxonAttributeDefinition) (getDefinition()));
    java.lang.String taxonomy = getAttribute(org.openforis.idm.metamodel.xml.internal.unmarshal.TAXONOMY, true);
    java.lang.String highestRankName = getAttribute(org.openforis.idm.metamodel.xml.internal.unmarshal.HIGHEST_RANK, false);
    java.lang.String qualifiers = getAttribute(org.openforis.idm.metamodel.xml.internal.unmarshal.QUALIFIERS, false);
    defn.setTaxonomy(taxonomy);
    defn.setHighestTaxonRank(org.openforis.idm.model.species.Taxon.TaxonRank.fromName(highestRankName, true));
    defn.setQualifiers(qualifiers);
}