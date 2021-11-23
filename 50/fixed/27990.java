private void setUpMocks() {
    org.mockito.Mockito.when(restoreSLTPPolicyMock.restoreSL(org.mockito.Matchers.any())).thenReturn(restoreSL);
    org.mockito.Mockito.when(restoreSLTPPolicyMock.restoreTP(org.mockito.Matchers.any())).thenReturn(restoreTP);
}