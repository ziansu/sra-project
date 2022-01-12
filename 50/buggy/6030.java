@org.junit.Test
public void Setup_Menu() {
    presenter.setupMenu();
    org.mockito.Mockito.verify(mainView, org.mockito.Mockito.times(1)).setup();
}