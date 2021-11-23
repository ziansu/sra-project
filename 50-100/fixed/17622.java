@org.testng.annotations.Test
public void should_return_BatchUsersRequestAdapter() throws java.lang.Exception {
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.users.UsersService service = new com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.users.UsersService(sessionStorageMock);
    org.powermock.api.mockito.PowerMockito.whenNew(com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.users.BatchUsersRequestAdapter.class).withArguments(org.mockito.Matchers.eq(sessionStorageMock), org.mockito.Matchers.anyString()).thenReturn(batchUsersRequestAdapterMock);
    com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.users.BatchUsersRequestAdapter retrieved = service.allUsers();
    org.testng.Assert.assertNotNull(retrieved);
    org.testng.Assert.assertSame(retrieved, batchUsersRequestAdapterMock);
}