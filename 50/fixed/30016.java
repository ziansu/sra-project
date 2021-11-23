public void mockProperty(java.lang.String property, java.lang.String value) {
    org.mockito.Mockito.when(props.get(property)).thenReturn(value);
}