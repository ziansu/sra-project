public void build(java.lang.String path) throws java.lang.Exception {
    java.lang.System.out.println(new java.io.File(path).exists());
    java.lang.String test = new Controllers.In(path).readAll();
    Controllers.In mock = org.mockito.Mockito.mock(Controllers.In.class);
    org.powermock.api.mockito.PowerMockito.whenNew(Controllers.In.class).withAnyArguments().thenReturn(mock);
    org.mockito.Mockito.when(mock.readAll()).thenReturn(test);
}