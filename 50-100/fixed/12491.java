public java.util.List<org.inaturalist.android.GuideTaxonXML> getTaxa(org.inaturalist.android.GuideTaxonFilter filter) {
    java.lang.String xPathExpression = buildFilterXpath(filter);
    java.util.ArrayList<org.w3c.dom.Node> nodes = getNodesByXPath(xPathExpression);
    java.util.ArrayList<org.inaturalist.android.GuideTaxonXML> taxa = new java.util.ArrayList<org.inaturalist.android.GuideTaxonXML>();
    if (nodes == null) {
        return taxa;
    }
    for (org.w3c.dom.Node node : nodes) {
        taxa.add(new org.inaturalist.android.GuideTaxonXML(this, node));
    }
    return taxa;
}