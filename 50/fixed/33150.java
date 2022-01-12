@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    modalPresenter.setErrorMessage(caught.getMessage());
}