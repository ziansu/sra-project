@org.junit.Test
public void createDocumentReferenceWhenEmptyParameters() throws java.lang.Exception {
    org.mockito.Mockito.when(this.componentManager.getInstance(DocumentReferenceResolver.TYPE_REFERENCE, "default")).thenReturn(this.resolver);
    org.xwiki.model.reference.DocumentReference reference = new org.xwiki.model.reference.DocumentReference("defaultwiki", "defaultspace", "defaultpage");
    org.mockito.Mockito.when(this.resolver.resolve(null)).thenReturn(reference);
    org.junit.Assert.assertEquals(reference, this.service.createDocumentReference("", "", "", "default"));
}