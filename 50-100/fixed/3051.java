@org.junit.Test
public void createDocumentReferenceWithDefaultHint() throws java.lang.Exception {
    when(this.componentManager.getInstance(DocumentReferenceResolver.TYPE_REFERENCE, "current")).thenReturn(this.resolver);
    org.xwiki.model.reference.DocumentReference reference = new org.xwiki.model.reference.DocumentReference("wiki", "space", "page");
    when(this.resolver.resolve(reference)).thenReturn(reference);
    org.junit.Assert.assertEquals(reference, this.service.createDocumentReference("wiki", "space", "page"));
}