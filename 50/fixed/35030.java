@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    presenter.setErrorMessage(caught.getMessage());
}