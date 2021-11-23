@org.junit.Test
public void sholdCreateErrorMessageIfPasswordEmpty() {
    org.mockito.Mockito.when(mockLoginView.getUserName()).thenReturn("username");
    org.mockito.Mockito.when(mockLoginView.getPassword()).thenReturn("");
    presenter.saveUser();
    org.mockito.Mockito.verify(mockLoginView, org.mockito.Mockito.times(1)).getUserName();
    org.mockito.Mockito.verify(mockLoginView, org.mockito.Mockito.never()).getPassword();
    org.mockito.Mockito.verify(mockLoginView, org.mockito.Mockito.times(1)).showInputError();
}