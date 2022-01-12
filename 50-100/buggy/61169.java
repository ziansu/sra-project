@org.junit.Test
public void setPropertyValueShouldSetValueAndCommentToPropertyInContext() throws ch.puzzle.itc.mobiliar.business.utils.ValidationException {
    java.lang.String unobfuscatedValue = "some value";
    ch.puzzle.itc.mobiliar.business.property.entity.PropertyEntity propertyMock = org.mockito.Mockito.mock(ch.puzzle.itc.mobiliar.business.property.entity.PropertyEntity.class);
    org.mockito.Mockito.when(resourceContextMock.getPropertyForDescriptor(propertyDescriptorId)).thenReturn(propertyMock);
    org.mockito.Mockito.when(propertyValidationServiceMock.canPropertyValueBeSetOnContext(org.mockito.Mockito.any(ch.puzzle.itc.mobiliar.business.property.entity.PropertyDescriptorEntity.class), org.mockito.Mockito.any(ch.puzzle.itc.mobiliar.business.environment.entity.ContextDependency.class))).thenReturn(true);
    service.setPropertyValue(resourceContextMock, propertyDescriptorId, unobfuscatedValue);
    org.mockito.Mockito.verify(propertyMock).setValueAndEncrypt(unobfuscatedValue);
}