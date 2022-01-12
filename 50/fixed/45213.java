@java.lang.Override
public void processResult(com.duggan.workflow.client.ui.error.ErrorPresenter result) {
    java.lang.String message = event.getMessage();
    result.setMessage(message, event.getId());
    this.addToPopupSlot(result, true);
}