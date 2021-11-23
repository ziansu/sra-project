@org.junit.Test
public void getEntityReferenceValue() throws java.lang.Exception {
    org.mockito.Mockito.when(this.componentManager.getInstance(org.xwiki.model.reference.EntityReferenceValueProvider.class, "current")).thenReturn(this.valueProvider);
    org.mockito.Mockito.when(this.valueProvider.getDefaultValue(EntityType.WIKI)).thenReturn("somewiki");
    org.junit.Assert.assertEquals("somewiki", this.service.getEntityReferenceValue(EntityType.WIKI));
}