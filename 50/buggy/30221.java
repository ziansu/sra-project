@org.junit.Test
public void Set_View() {
    presenter.clearView();
    presenter.setView(mainView);
    org.junit.Assert.assertEquals(presenter.getView(), mainView);
}