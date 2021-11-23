private void addIdentifierRestriction(org.hibernate.Criteria c, java.util.Collection<java.lang.String> identifiers) {
    if (org.n52.sos.util.CollectionHelper.isNotEmpty(identifiers)) {
        c.add(org.hibernate.criterion.Restrictions.in(FeatureOfInterest.IDENTIFIER, identifiers));
    }
}