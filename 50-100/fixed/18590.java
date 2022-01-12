@org.junit.Test
public void createDocumentReferenceWhenPageParameterEmpty() throws java.lang.Exception {
    when(this.componentManager.getInstance(DocumentReferenceResolver.TYPE_REFERENCE, "default")).thenReturn(this.resolver);
    org.xwiki.model.reference.DocumentReference reference = new org.xwiki.model.reference.DocumentReference("wiki", "space", "defaultpage");
    when(this.resolver.resolve(new org.xwiki.model.reference.EntityReference("space", org.xwiki.model.EntityType.SPACE, new org.xwiki.model.reference.EntityReference("wiki", org.xwiki.model.EntityType.WIKI)))).thenReturn(reference);
    org.junit.Assert.assertEquals(reference, this.service.createDocumentReference("wiki", "space", "", "default"));
}