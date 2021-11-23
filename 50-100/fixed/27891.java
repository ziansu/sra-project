@org.junit.Test
public void createDocumentReferenceWhenEmptyParameters() throws java.lang.Exception {
    when(this.componentManager.getInstance(DocumentReferenceResolver.TYPE_REFERENCE, "default")).thenReturn(this.resolver);
    org.xwiki.model.reference.DocumentReference reference = new org.xwiki.model.reference.DocumentReference("defaultwiki", "defaultspace", "defaultpage");
    when(this.resolver.resolve(null)).thenReturn(reference);
    org.junit.Assert.assertEquals(reference, this.service.createDocumentReference("", "", "", "default"));
}