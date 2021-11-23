public boolean isBookmarkable() {
    final org.apache.isis.core.metamodel.spec.feature.ObjectAction action = getActionMemento().getAction(getSpecificationLoader());
    final org.apache.isis.core.metamodel.facets.object.bookmarkpolicy.BookmarkPolicyFacet bookmarkPolicy = action.getFacet(org.apache.isis.core.metamodel.facets.object.bookmarkpolicy.BookmarkPolicyFacet.class);
    final boolean safeSemantics = action.getSemantics().isSafeInNature();
    return ((bookmarkPolicy.value()) == (org.apache.isis.applib.annotation.BookmarkPolicy.AS_ROOT)) && safeSemantics;
}