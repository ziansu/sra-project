@java.lang.Override
protected void execClickAction() {
    org.eclipse.scout.demo.wrappedform.client.ui.forms.AbstractDetachableForm form = createFormCopy();
    form.setDetached(true);
    form.setDisplayParent(org.eclipse.scout.demo.wrappedform.client.ClientSession.get().getDesktop());
    form.setDisplayHint(IForm.DISPLAY_HINT_POPUP_WINDOW);
    form.setAskIfNeedSave(false);
    form.startPageForm();
    form.waitFor();
}