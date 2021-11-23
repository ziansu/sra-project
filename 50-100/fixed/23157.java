@java.lang.Override
public void initSubPanel() {
    if (findOpenCV()) {
        getConsole().getImcMsgManager().addListener(this);
        configLayout();
        updater = updaterThread();
        updater.start();
        saveImg = updaterThreadSave();
        saveImg.start();
    }else {
        pt.lsts.neptus.NeptusLog.pub().error("Opencv not found.");
        closingPanel = true;
        return ;
    }
}