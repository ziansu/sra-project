public void pause(int id) {
    boolean isPause = id == (org.talend.designer.runprocess.ui.views.ProcessView.PAUSE_ID);
    setExecBtn(isPause);
    if (isPause) {
        itemDropDown.setText(org.talend.designer.runprocess.i18n.Messages.getString("ProcessComposite.textContent"));
        itemDropDown.setToolTipText(org.talend.designer.runprocess.i18n.Messages.getString("ProcessComposite.tipTextContent"));
        itemDropDown.setData(ProcessView.RESUME_ID);
        itemDropDown.setImage(org.talend.commons.ui.runtime.image.ImageProvider.getImage(ERunprocessImages.RUN_PROCESS_ACTION));
    }else {
        itemDropDown.setData(ProcessView.PAUSE_ID);
    }
    org.talend.designer.runprocess.ui.DebugProcessTosComposite.processContext.setTracPause(isPause);
}