@org.junit.Test
public void resolveSpace() throws java.lang.Exception {
    when(this.componentManager.getInstance(EntityReferenceResolver.TYPE_STRING, "current")).thenReturn(this.stringEntityReferenceResolver);
    org.xwiki.model.reference.SpaceReference reference = new org.xwiki.model.reference.SpaceReference("Space", new org.xwiki.model.reference.WikiReference("wiki"));
    when(this.stringEntityReferenceResolver.resolve("x", EntityType.SPACE, new java.lang.Object[]{  })).thenReturn(reference);
    org.junit.Assert.assertEquals(reference, this.service.resolveSpace("x"));
}