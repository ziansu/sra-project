@org.junit.Test
public void createDocumentReferenceWhenInvalidHint() throws java.lang.Exception {
    org.mockito.Mockito.when(this.componentManager.getInstance(DocumentReferenceResolver.TYPE_REFERENCE, "invalid")).thenThrow(new org.xwiki.component.manager.ComponentLookupException("error"));
    org.mockito.Mockito.when(this.componentManager.getInstance(org.xwiki.model.reference.DocumentReferenceResolver.class, "invalid")).thenThrow(new org.xwiki.component.manager.ComponentLookupException("error"));
    org.junit.Assert.assertNull(this.service.createDocumentReference("wiki", "space", "page", "invalid"));
}