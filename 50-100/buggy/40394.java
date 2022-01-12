@java.lang.Override
public void sessionSaved(java.lang.Exception e) {
    if (e == null) {
        setTitle();
    }else {
        view.showWarningDialog(Constant.messages.getString("menu.file.savingSession.error"));
        org.parosproxy.paros.control.MenuFileControl.log.error(("error saving session file " + (model.getSession().getFileName())), e);
        org.parosproxy.paros.control.MenuFileControl.log.error(e.getMessage(), e);
    }
    if ((waitMessageDialog) != null) {
        waitMessageDialog.setVisible(false);
        waitMessageDialog = null;
    }
}