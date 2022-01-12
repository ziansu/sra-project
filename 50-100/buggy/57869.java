@org.junit.Test
public void createDocumentReferenceWhenWikiParameterEmpty() throws java.lang.Exception {
    org.mockito.Mockito.when(this.componentManager.getInstance(DocumentReferenceResolver.TYPE_REFERENCE, "default")).thenReturn(this.resolver);
    org.xwiki.model.reference.DocumentReference reference = new org.xwiki.model.reference.DocumentReference("defaultwiki", "space", "page");
    org.mockito.Mockito.when(this.resolver.resolve(new org.xwiki.model.reference.EntityReference("page", org.xwiki.model.EntityType.DOCUMENT, new org.xwiki.model.reference.EntityReference("space", org.xwiki.model.EntityType.SPACE)))).thenReturn(reference);
    org.junit.Assert.assertEquals(reference, this.service.createDocumentReference("", "space", "page", "default"));
}