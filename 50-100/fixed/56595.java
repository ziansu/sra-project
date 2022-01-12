private se.uu.ub.cora.bookkeeper.data.DataGroup createChildReferencesForBook() {
    se.uu.ub.cora.bookkeeper.data.DataGroup childReferences = se.uu.ub.cora.bookkeeper.data.DataGroup.withNameInData("childReferences");
    se.uu.ub.cora.bookkeeper.data.DataGroup childReference = createChildReferenceWithIdRepeatMinAndRepeatMax("bookTitleTextVar", "1", "1");
    se.uu.ub.cora.bookkeeper.data.DataGroup childRefSearchTerm = createSearchTerm("titleSearchTerm");
    childReference.addChild(childRefSearchTerm);
    childReferences.addChild(childReference);
    se.uu.ub.cora.bookkeeper.data.DataGroup childReference2 = createChildReferenceWithIdRepeatMinAndRepeatMax("personRoleGroup", "1", "2");
    se.uu.ub.cora.bookkeeper.data.DataGroup childRefSearchTerm2 = createSearchTerm("someGroupSearchTerm");
    childReference2.addChild(childRefSearchTerm2);
    childReferences.addChild(childReference2);
    return childReferences;
}